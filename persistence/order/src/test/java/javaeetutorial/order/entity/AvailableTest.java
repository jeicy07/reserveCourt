/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.entity;

import java.util.Calendar;
import java.util.List;
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
public class AvailableTest {
    
    public AvailableTest() {
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
     * Test of getCourt_id method, of class Available.
     */
    @Test
    public void testGetCourt_id() {
        System.out.println("getCourt_id");
        Available instance = null;
        int expResult = 0;
        int result = instance.getCourt_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart_date method, of class Available.
     */
    @Test
    public void testGetStart_date() {
        System.out.println("getStart_date");
        Available instance = null;
        Calendar expResult = null;
        Calendar result = instance.getStart_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart_hour method, of class Available.
     */
    @Test
    public void testGetStart_hour() {
        System.out.println("getStart_hour");
        Available instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.getStart_hour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourt_id method, of class Available.
     */
    @Test
    public void testSetCourt_id() {
        System.out.println("setCourt_id");
        int court_id = 0;
        Available instance = null;
        instance.setCourt_id(court_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_date method, of class Available.
     */
    @Test
    public void testSetStart_date() {
        System.out.println("setStart_date");
        Calendar start_date = null;
        Available instance = null;
        instance.setStart_date(start_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart_hour method, of class Available.
     */
    @Test
    public void testSetStart_hour() {
        System.out.println("setStart_hour");
        List<Integer> start_hour = null;
        Available instance = null;
        instance.setStart_hour(start_hour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
