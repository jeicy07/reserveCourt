/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.ejb;

import java.util.Calendar;
import java.util.List;
import javaeetutorial.order.entity.Available;
import javaeetutorial.order.entity.Court;
import javaeetutorial.order.entity.Reserve;
import javaeetutorial.order.entity.User;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qiaofuli
 */
public class RequestBeanTest {
    
    public RequestBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createCourt method, of class RequestBean.
     */
//    @Test
//    public void testCreateCourt() throws Exception {
//        System.out.println("createCourt");
//        Integer court_id = null;
//        int court_category = 0;
//        int stadium = 0;
//        int court_no = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        instance.createCourt(court_id, court_category, stadium, court_no);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of createUser method, of class RequestBean.
     */
    @Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        String username = "";
        String name = "";
        String password = "";
        String phone = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
        instance.createUser(username, name, password, phone);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createReserve method, of class RequestBean.
//     */
//    @Test
//    public void testCreateReserve() throws Exception {
//        System.out.println("createReserve");
//        int court_id = 0;
//        Calendar start_date = null;
//        int start_hour = 0;
//        String username = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        instance.createReserve(court_id, start_date, start_hour, username);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of register method, of class RequestBean.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("register");
        String username = "";
        String password = "";
        String name = "";
        String telephone = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
        boolean expResult = false;
        boolean result = instance.register(username, password, name, telephone);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class RequestBean.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String username = "";
        String password = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modify method, of class RequestBean.
     */
    @Test
    public void testModify() throws Exception {
        System.out.println("modify");
        String username = "";
        String newPassword = "";
        String newPhone = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
        boolean expResult = false;
        boolean result = instance.modify(username, newPassword, newPhone);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of user_info method, of class RequestBean.
     */
    @Test
    public void testUser_info() throws Exception {
        System.out.println("user_info");
        String username = "1234567";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
        User expResult = null;
        User result = instance.user_info(username);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of reserveCourt method, of class RequestBean.
//    */
//    @Test
//    public void testReserveCourt() throws Exception {
//        System.out.println("reserveCourt");
//        int court_id = 0;
//        int year = 0;
//        int month = 0;
//        int date = 0;
//        int hour = 0;
//        String username = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        boolean expResult = false;
//        boolean result = instance.reserveCourt(court_id, year, month, date, hour, username);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cancelReserve method, of class RequestBean.
//     */
//    @Test
//    public void testCancelReserve() throws Exception {
//        System.out.println("cancelReserve");
//        int reserve_id = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        boolean expResult = false;
//        boolean result = instance.cancelReserve(reserve_id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class RequestBean.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        List<Integer> list2 = null;
//        List<Integer> expResult = null;
//        List<Integer> result = RequestBean.remove(list2);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of queryByTime method, of class RequestBean.
//     */
//    @Test
//    public void testQueryByTime() throws Exception {
//        System.out.println("queryByTime");
//        Calendar start_date = null;
//        int start_hour = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Integer> expResult = null;
//        List<Integer> result = instance.queryByTime(start_date, start_hour);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of queryByCategory method, of class RequestBean.
//     */
//    @Test
//    public void testQueryByCategory() throws Exception {
//        System.out.println("queryByCategory");
//        String category = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Available> expResult = null;
//        List<Available> result = instance.queryByCategory(category);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of queryByTimeAndCategory method, of class RequestBean.
//     */
//    @Test
//    public void testQueryByTimeAndCategory() throws Exception {
//        System.out.println("queryByTimeAndCategory");
//        Calendar start_date = null;
//        int start_hour = 0;
//        int category = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Integer> expResult = null;
//        List<Integer> result = instance.queryByTimeAndCategory(start_date, start_hour, category);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllReserves method, of class RequestBean.
//     */
//    @Test
//    public void testGetAllReserves() throws Exception {
//        System.out.println("getAllReserves");
//        String username = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Reserve> expResult = null;
//        List<Reserve> result = instance.getAllReserves(username);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllCourts method, of class RequestBean.
//     */
//    @Test
//    public void testGetAllCourts() throws Exception {
//        System.out.println("getAllCourts");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Court> expResult = null;
//        List<Court> result = instance.getAllCourts();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    

//////    /**
//////     * Test of createCourt method, of class RequestBean.
//////     */
//////    @Test
//////    public void testCreateCourt() throws Exception {
//////        System.out.println("createCourt");
//////        Integer court_id = null;
//////        int court_category = 0;
//////        int stadium = 0;
//////        int court_no = 0;
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        instance.createCourt(court_id, court_category, stadium, court_no);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of createReserve method, of class RequestBean.
//////     */
//////    @Test
//////    public void testCreateReserve() throws Exception {
//////        System.out.println("createReserve");
//////        int court_id = 0;
//////        Calendar start_date = null;
//////        int start_hour = 0;
//////        String username = "";
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        instance.createReserve(court_id, start_date, start_hour, username);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of reserveCourt method, of class RequestBean.
//////     */
//////    @Test
//////    public void testReserveCourt() throws Exception {
//////        System.out.println("reserveCourt");
//////        int court_id = 0;
//////        int year = 0;
//////        int month = 0;
//////        int date = 0;
//////        int hour = 0;
//////        String username = "";
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        boolean expResult = false;
//////        boolean result = instance.reserveCourt(court_id, year, month, date, hour, username);
//////        assertEquals(expResult, result);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of cancelReserve method, of class RequestBean.
//////     */
//////    @Test
//////    public void testCancelReserve() throws Exception {
//////        System.out.println("cancelReserve");
//////        int reserve_id = 0;
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        boolean expResult = false;
//////        boolean result = instance.cancelReserve(reserve_id);
//////        assertEquals(expResult, result);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of remove method, of class RequestBean.
//////     */
//////    @Test
//////    public void testRemove() throws Exception {
//////        System.out.println("remove");
//////        List<Integer> list2 = null;
//////        List<Integer> expResult = null;
//////        List<Integer> result = RequestBean.remove(list2);
//////        assertEquals(expResult, result);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of queryByTime method, of class RequestBean.
//////     */
//////    @Test
//////    public void testQueryByTime() throws Exception {
//////        System.out.println("queryByTime");
//////        Calendar start_date = null;
//////        int start_hour = 0;
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        List<Integer> expResult = null;
//////        List<Integer> result = instance.queryByTime(start_date, start_hour);
//////        assertEquals(expResult, result);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of queryByCategory method, of class RequestBean.
//////     */
//////    @Test
//////    public void testQueryByCategory() throws Exception {
//////        System.out.println("queryByCategory");
//////        String category = "";
//////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//////        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//////        List<Available> expResult = null;
//////        List<Available> result = instance.queryByCategory(category);
//////        assertEquals(expResult, result);
//////        container.close();
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }

    /**
     * Test of queryByTimeAndCategory method, of class RequestBean.
     */
//    @Test
//    public void testQueryByTimeAndCategory() throws Exception {
//        System.out.println("queryByTimeAndCategory");
//        Calendar start_date = null;
//        int start_hour = 0;
//        int category = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Integer> expResult = null;
//        List<Integer> result = instance.queryByTimeAndCategory(start_date, start_hour, category);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllReserves method, of class RequestBean.
//     */
//    @Test
//    public void testGetAllReserves() throws Exception {
//        System.out.println("getAllReserves");
//        String username = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Reserve> expResult = null;
//        List<Reserve> result = instance.getAllReserves(username);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllCourts method, of class RequestBean.
//     */
//    @Test
//    public void testGetAllCourts() throws Exception {
//        System.out.println("getAllCourts");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        RequestBean instance = (RequestBean)container.getContext().lookup("java:global/classes/RequestBean");
//        List<Court> expResult = null;
//        List<Court> result = instance.getAllCourts();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
