/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.entity;

import java.util.Collection;
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
public class CourtTest {
    
    public CourtTest() {
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
     * Test of getCourtId method, of class Court.
     */
    @Test
    public void testGetCourtId() {
        System.out.println("getCourtId");
        Court instance = new Court();
        Integer expResult = null;
        Integer result = instance.getCourtId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourtId method, of class Court.
     */
    @Test
    public void testSetCourtId() {
        System.out.println("setCourtId");
        Integer court_id = null;
        Court instance = new Court();
        instance.setCourtId(court_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourtCategory method, of class Court.
     */
    @Test
    public void testGetCourtCategory() {
        System.out.println("getCourtCategory");
        Court instance = new Court();
        int expResult = 0;
        int result = instance.getCourtCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourtCategory method, of class Court.
     */
    @Test
    public void testSetCourtCategory() {
        System.out.println("setCourtCategory");
        int court_category = 0;
        Court instance = new Court();
        instance.setCourtCategory(court_category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStadium method, of class Court.
     */
    @Test
    public void testGetStadium() {
        System.out.println("getStadium");
        Court instance = new Court();
        int expResult = 0;
        int result = instance.getStadium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStadium method, of class Court.
     */
    @Test
    public void testSetStadium() {
        System.out.println("setStadium");
        int stadium = 0;
        Court instance = new Court();
        instance.setStadium(stadium);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourtNo method, of class Court.
     */
    @Test
    public void testGetCourtNo() {
        System.out.println("getCourtNo");
        Court instance = new Court();
        int expResult = 0;
        int result = instance.getCourtNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourtNo method, of class Court.
     */
    @Test
    public void testSetCourtNo() {
        System.out.println("setCourtNo");
        int court_no = 0;
        Court instance = new Court();
        instance.setCourtNo(court_no);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReserves method, of class Court.
     */
    @Test
    public void testGetReserves() {
        System.out.println("getReserves");
        Court instance = new Court();
        Collection<Reserve> expResult = null;
        Collection<Reserve> result = instance.getReserves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
