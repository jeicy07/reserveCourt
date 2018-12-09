
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
import javax.persistence.PersistenceContext;


@Stateful
public class RequestBean {
    
    @PersistenceContext
    private EntityManager em;

    private static final Logger logger = Logger.getLogger("order.ejb.RequestBean");
    
    // by d10
    public void createCourt(Integer court_id, int court_category,
                            int stadium, int court_no){
        try {
            Court court = new Court(court_id, court_category, stadium, court_no);
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
    public void createReserve(int court_id,
            Calendar start_date,
            int start_hour,
            String username) {
        try {
            Reserve reserve = new Reserve(start_date,start_hour);

            Court court = em.find(Court.class,court_id);
            reserve.setCourt(court);

            User user = em.find(User.class,username);
            reserve.setUser(user);
            
            reserve.setStatus(1);
            em.persist(reserve);

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
            if (user1 != null && (!user1.getPassword().equals(newPassword) || 
                    !user1.getPassword().equals(newPhone))){
                user1.setPassword(newPassword);
                user1.setPhone(newPhone);
                em.persist(user1);
                return true;
            }              
        } catch (EJBException e) {
            throw new EJBException(e.getMessage());
        } 
        return false;
    }

    // by fuli 
    public User user_info(String username){
        try{ 
            User user = em.find(User.class, username);
            return user;
        }catch(Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
    
    // by van
    public boolean reserveCourt(int court_id, int year, int month, int date,
            int hour, String username){
        try {
            Calendar reDate = Calendar.getInstance();
            reDate.set(year, month, date);
            createReserve(court_id, reDate, hour, username);
            return true;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());          
        }
    }
    
    // by van
    public boolean cancelReserve(int reserve_id) {
        try {
            Reserve reserve = em.find(Reserve.class, reserve_id);
            reserve.setStatus(2);
            em.persist(reserve);
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

        for (int court_id = 1; court_id < 14; court_id++){
            list1.add(court_id);
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
    public List<Integer> queryByTime(Calendar start_date, int start_hour){
        
        List<Integer> reserved_court_ids = new ArrayList<>();
        List<Integer> available_court_ids = new ArrayList<>();
        try {
            List reserved_courts;
            reserved_courts = em.createNamedQuery("findReservesByTime")
                    .setParameter("start_date", start_date)
                    .setParameter("start_hour", start_hour)
                    .getResultList();
            for (Iterator iterator = reserved_courts.iterator(); iterator.hasNext();) {
                Reserve re = (Reserve)iterator.next();
                reserved_court_ids.add(re.getCourt().getCourtId());
            }
            available_court_ids = remove(reserved_court_ids);
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        return available_court_ids;
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
                        .setParameter("court_id", co.getCourtId())
                        .setParameter("start_date", today)
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
    public List<Integer> queryByTimeAndCategory(Calendar start_date, 
                                                    int start_hour, 
                                                    int category){
        
        List<Integer> reserved_court_ids = new ArrayList<>();
        List<Integer> available_court_ids = new ArrayList<>();
        try {
            List reserved_courts;
            reserved_courts = em.createNamedQuery("findReservedCourtsByCategoryAndTime")
                    .setParameter("start_date", start_date)
                    .setParameter("start_hour", start_hour)
                    .setParameter("category", category)
                    .getResultList();
            for (Iterator iterator = reserved_courts.iterator(); iterator.hasNext();) {
                Reserve re = (Reserve)iterator.next();
                reserved_court_ids.add(re.getCourt().getCourtId());
            }
            available_court_ids = remove(reserved_court_ids);
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        return available_court_ids;
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
    
    public boolean reserve_court(int reserve_id, int court_id, Date start_date,
            int hour, String user_name, int status){
        try {
            Reserve reserve = new CustomerOrder();
            reserve.setReserve_id(reserve_id);
            reserve.setCourt_id(court_id);
            reserve.setStart_date(start_date);
            reserve.setstart_hour(hour);
            reserve.setStatus(status);
            em.persist(reserve);
            return true;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
    
    public boolean cancel_reserve(int reserve_id) {
        try {
            Reserve reserve = em.find(Reserve.class, reserve_id);
            em.remove(reserve);
            return true;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
            //return false;
        }
    }
}
