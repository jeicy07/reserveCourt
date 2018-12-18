
package javaeetutorial.order.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaeetutorial.order.entity.User;
import javaeetutorial.order.entity.Reserve;
import javaeetutorial.order.entity.Court;
import javaeetutorial.order.entity.Available;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;


@Stateful
public class RequestBean {
    
    @PersistenceContext
    private EntityManager em;

    private static final Logger logger = Logger.getLogger("order.ejb.RequestBean");
    
    // by d10
    public void createCourt(int courtId, int courtCategory,
                            int stadium, int courtNo){
        try {
            Court court = new Court(courtId, courtCategory, stadium, courtNo);
            em.persist(court);
        } catch (Exception e) {
            throw new EJBException(e);
        }
    }   
    
    //by jeicy
    public void createUser(String username, 
                            String name, 
                            String password, 
                            String phone){
        try{
            User user = new User(username, name, password, phone);
            em.persist(user);
        } catch (Exception e){
            throw new EJBException(e);
        }
        
    }
    
    // by sun
    public void createReserve(int courtId,
            Calendar startDate,
            int startHour,
            String username) {
        try {
            Reserve reserve = new Reserve(startDate,startHour);
            em.persist(reserve);

            Court court = em.find(Court.class,courtId);
            reserve.setCourt(court);

            User user = em.find(User.class,username);
            reserve.setUser(user);
            
            reserve.setStatus(1);
            em.merge(reserve);
            em.flush();

        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }
    
    // by fuli
    public boolean register(String username, String password, String name, String telephone) {           
        try {    
            User user1 = em.find(User.class, username);
            if (user1 == null){
                createUser(username, password, name, telephone);
                return true;
            }
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        
        return false;
    }

    // by fuli
    public boolean login (String username, String password){
    
        try{
            User user1 = em.find(User.class, username);
            if(user1 != null && password.equals(user1.getPassword())){
                return true;
            }
        } catch(Exception e){
            throw new EJBException(e);
        }
        return false;   
    }   

    // by fuli
    public boolean modify (String username, String newPassword, String newPhone){
        try {
            User user1 = em.find(User.class, username);
            if (user1 != null){
                logger.log(Level.INFO,"ffff");
                if (!"".equals(newPassword) || !"".equals(newPhone)){
                    if (!"".equals(newPassword)){
                        user1.setPassword(newPassword);
                    }
                    if (!"".equals(newPhone)){
                        user1.setPhone(newPhone);
                    }
                    em.merge(user1);
                    em.flush();
                    return true;
                    
                }
                else return false;
               
            }
            
                       
        } catch (EJBException e) {
            throw new EJBException(e.getMessage());
        } 
        return false;
    }

    // by fuli 
    public User userInfo(String username){
        try{ 
            User user = em.find(User.class, username);
            return user;
        }catch(Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
    
    // by van
    public boolean reserveCourt(int courtId, int year, int month, int date,
            int hour, String username){
        try {
            Calendar reDate = Calendar.getInstance();
            reDate.set(year, month-1, date);
            createReserve(courtId, reDate, hour, username);
            return true;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());          
        }
    }
    
    // by van
    public boolean cancelReserve(int reserveId) {
        try {
            Reserve reserve = em.find(Reserve.class, reserveId);
            reserve.setStatus(2);
            em.merge(reserve);
            em.flush();
            return true;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        
    }

    
    // by d10: create time array and remove reserved time
    public static List<Integer> remove(List<Integer>  list2){
        int i, j;
        List<Integer>  result = new ArrayList<>();
        List<Integer>  list1 = new ArrayList<>();

        for (int courtId = 1; courtId < 14; courtId++){
            list1.add(courtId);
        }

        for(i = 0; i < list1.size(); i++){
            for (j = 0; j < list2.size(); j++){
                if (list1.get(i).equals(list2.get(j))){break;}
            }                                                                                                                                  
            if (j == list2.size()){result.add(list1.get(i));}
        }
        return result;
    }
    
    // by d10
    public List<Integer> queryByTime(Calendar startDate, int startHour){
        
        List<Integer> reservedCourtIds = new ArrayList<>();
        List<Integer> availableCourtIds = new ArrayList<>();
        try {
            List reservedCourts;
            reservedCourts = em.createNamedQuery("findReservesByTime")
                    .setParameter("startDate", startDate)
                    .setParameter("startHour", startHour)
                    .getResultList();
            for (Iterator iterator = reservedCourts.iterator(); iterator.hasNext();) {
                Reserve re = (Reserve)iterator.next();
                reservedCourtIds.add(re.getCourt().getCourtId());
            }
            availableCourtIds = remove(reservedCourtIds);
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        return availableCourtIds;
    }
    
    // by jeicy
    public List<Available> queryByCategory(String category){
        List<Available> results = new ArrayList<>();
        
        try {
            List courts;
            courts = em.createNamedQuery("findCourtsByCategory")
                    .setParameter("category", category)
                    .getResultList();
            for (Iterator coIt = courts.iterator(); coIt.hasNext();){
                // every court that matches catogory
                Court co = (Court)coIt.next();    
                
                Calendar today = Calendar.getInstance();
                int cnt = 1;
                
                while (cnt < 8){  
                    // everyday in a week
                    today.add(Calendar.DATE, 1);
                    
                    List<Integer> hour = new ArrayList<>();       
                    for(int i = 16; i < 22; i++)
                    {
                        hour.add(i);
                    }
                    
                    List reserves;
                    reserves = em.createNamedQuery("findReservesByCourtIDAndDate")
                        .setParameter("courtId", co.getCourtId())
                        .setParameter("startDate", today)
                        .getResultList();  
                    if (reserves != null){
                        for (Iterator reIt = reserves.iterator(); reIt.hasNext();){
                            //delete every reservation on that day
                            Reserve re = (Reserve)reIt.next();
                            hour.remove(re.getStartHour());
                        }
                    }
                    Available tmp = new Available(co.getCourtId(), today, hour);
                    results.add(tmp);
                    cnt++;
                }               
            }         
        } catch (Exception e){
            throw new EJBException(e.getMessage());
        }
        return results;
    }
    
    // by jeicy
    public List<Integer> queryByTimeAndCategory(Calendar startDate, 
                                                    int startHour, 
                                                    int category){
        
        List<Integer> reservedCourtIds = new ArrayList<>();
        List<Integer> availableCourtIds = new ArrayList<>();
        try {
            List reservedCourts;
            reservedCourts = em.createNamedQuery("findReservedCourtsByCategoryAndTime")
                    .setParameter("startDate", startDate)
                    .setParameter("startHour", startHour)
                    .setParameter("category", category)
                    .getResultList();
            for (Iterator iterator = reservedCourts.iterator(); iterator.hasNext();) {
                Reserve re = (Reserve)iterator.next();
                reservedCourtIds.add(re.getCourt().getCourtId());
            }
            availableCourtIds = remove(reservedCourtIds);
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        return availableCourtIds;
    }
 
    

    // by sun
    public List<Reserve> getAllReserves(String username){
        List<Reserve> reserves = (List<Reserve>)em.createNamedQuery("findAllReserves")
                                .setParameter("username",username)
                                .getResultList();
        return reserves;
    }

    // by sun
    public List<Court> getAllCourts(){
        List<Court> courts = (List<Court>)em.createNamedQuery("findCourtsByCourtId").getResultList();
        return courts;
    }

    void createCourt(int i, String 篮球, String 光体, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
}