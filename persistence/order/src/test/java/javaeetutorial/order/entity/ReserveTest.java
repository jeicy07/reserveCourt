/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.entity;

import java.util.Calendar;
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
public class ReserveTest {
    
    public ReserveTest() {
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
     * Test of getReserveId method, of class Reserve.
     */
    @Test
    public void testGetReserveId() {
        System.out.println("getReserveId");
        Reserve instance = new Reserve();
        Long expResult = null;
        Long result = instance.getReserveId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReserveId method, of class Reserve.
     */
    @Test
    public void testSetReserveId() {
        System.out.println("setReserveId");
        Long reserve_id = null;
        Reserve instance = new Reserve();
        instance.setReserveId(reserve_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourt method, of class Reserve.
     */
    @Test
    public void testGetCourt() {
        System.out.println("getCourt");
        Reserve instance = new Reserve();
        Court expResult = null;
        Court result = instance.getCourt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourt method, of class Reserve.
     */
    @Test
    public void testSetCourt() {
        System.out.println("setCourt");
        Court court = null;
        Reserve instance = new Reserve();
        instance.setCourt(court);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart_date method, of class Reserve.
     */
    @Test
    public void testGetStart_date() {
        System.out.println("getStart_date");
        Reserve instance = new Reserve();
        Calendar expResult = null;
        Calendar result = instance.getStart_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_date method, of class Reserve.
     */
    @Test
    public void testSetStart_date() {
        System.out.println("setStart_date");
        Calendar start_date = null;
        Reserve instance = new Reserve();
        instance.setStart_date(start_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartHour method, of class Reserve.
     */
    @Test
    public void testGetStartHour() {
        System.out.println("getStartHour");
        Reserve instance = new Reserve();
        int expResult = 0;
        int result = instance.getStartHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartHour method, of class Reserve.
     */
    @Test
    public void testSetStartHour() {
        System.out.println("setStartHour");
        int start_hour = 0;
        Reserve instance = new Reserve();
        instance.setStartHour(start_hour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Reserve.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Reserve instance = new Reserve();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Reserve.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Reserve instance = new Reserve();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Reserve.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Reserve instance = new Reserve();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Reserve.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Reserve instance = new Reserve();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
