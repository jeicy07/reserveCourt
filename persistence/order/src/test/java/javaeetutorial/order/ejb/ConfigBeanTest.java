/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.ejb;

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
public class ConfigBeanTest {
    
    public ConfigBeanTest() {
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
     * Test of createData method, of class ConfigBean.
     */
    @Test
    public void testCreateData() throws Exception {
        System.out.println("createData");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ConfigBean instance = (ConfigBean)container.getContext().lookup("java:global/classes/ConfigBean");
        instance.createData();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class ConfigBean.
     */
    @Test
    public void testDeleteData() throws Exception {
        System.out.println("deleteData");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ConfigBean instance = (ConfigBean)container.getContext().lookup("java:global/classes/ConfigBean");
        instance.deleteData();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
