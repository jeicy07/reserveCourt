/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.web;

import java.util.List;
import javaeetutorial.order.entity.CustomerOrder;
import javaeetutorial.order.entity.LineItem;
import javaeetutorial.order.entity.Part;
import javax.faces.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jicl
 */
public class OrderManagerTest {
    
    public OrderManagerTest() {
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
     * Test of getOrders method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetOrders() {
        System.out.println("getOrders");
        OrderManager instance = new OrderManager();
        List<CustomerOrder> expResult = null;
        List<CustomerOrder> result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineItems method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetLineItems() {
        System.out.println("getLineItems");
        OrderManager instance = new OrderManager();
        List<LineItem> expResult = null;
        List<LineItem> result = instance.getLineItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeOrder method, of class OrderManager.
     */
    @org.junit.Test
    public void testRemoveOrder() {
        System.out.println("removeOrder");
        ActionEvent event = null;
        OrderManager instance = new OrderManager();
        instance.removeOrder(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVendor method, of class OrderManager.
     */
    @org.junit.Test
    public void testFindVendor() {
        System.out.println("findVendor");
        OrderManager instance = new OrderManager();
        instance.findVendor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submitOrder method, of class OrderManager.
     */
    @org.junit.Test
    public void testSubmitOrder() {
        System.out.println("submitOrder");
        OrderManager instance = new OrderManager();
        instance.submitOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLineItem method, of class OrderManager.
     */
    @org.junit.Test
    public void testAddLineItem() {
        System.out.println("addLineItem");
        OrderManager instance = new OrderManager();
        instance.addLineItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrders method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetOrders() {
        System.out.println("setOrders");
        List<CustomerOrder> orders = null;
        OrderManager instance = new OrderManager();
        instance.setOrders(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentOrder method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetCurrentOrder() {
        System.out.println("getCurrentOrder");
        OrderManager instance = new OrderManager();
        int expResult = 0;
        int result = instance.getCurrentOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentOrder method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetCurrentOrder() {
        System.out.println("setCurrentOrder");
        int currentOrder = 0;
        OrderManager instance = new OrderManager();
        instance.setCurrentOrder(currentOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderId method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderId() {
        System.out.println("getNewOrderId");
        OrderManager instance = new OrderManager();
        Integer expResult = null;
        Integer result = instance.getNewOrderId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderId method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderId() {
        System.out.println("setNewOrderId");
        Integer newOrderId = null;
        OrderManager instance = new OrderManager();
        instance.setNewOrderId(newOrderId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderShippingInfo method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderShippingInfo() {
        System.out.println("getNewOrderShippingInfo");
        OrderManager instance = new OrderManager();
        String expResult = "";
        String result = instance.getNewOrderShippingInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderShippingInfo method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderShippingInfo() {
        System.out.println("setNewOrderShippingInfo");
        String newOrderShippingInfo = "";
        OrderManager instance = new OrderManager();
        instance.setNewOrderShippingInfo(newOrderShippingInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderStatus method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderStatus() {
        System.out.println("getNewOrderStatus");
        OrderManager instance = new OrderManager();
        char expResult = ' ';
        char result = instance.getNewOrderStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderStatus method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderStatus() {
        System.out.println("setNewOrderStatus");
        char newOrderStatus = ' ';
        OrderManager instance = new OrderManager();
        instance.setNewOrderStatus(newOrderStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderDiscount method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderDiscount() {
        System.out.println("getNewOrderDiscount");
        OrderManager instance = new OrderManager();
        int expResult = 0;
        int result = instance.getNewOrderDiscount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderDiscount method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderDiscount() {
        System.out.println("setNewOrderDiscount");
        int newOrderDiscount = 0;
        OrderManager instance = new OrderManager();
        instance.setNewOrderDiscount(newOrderDiscount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderParts method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderParts() {
        System.out.println("getNewOrderParts");
        OrderManager instance = new OrderManager();
        List<Part> expResult = null;
        List<Part> result = instance.getNewOrderParts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderParts method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderParts() {
        System.out.println("setNewOrderParts");
        List<Part> newOrderParts = null;
        OrderManager instance = new OrderManager();
        instance.setNewOrderParts(newOrderParts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendorName method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetVendorName() {
        System.out.println("getVendorName");
        OrderManager instance = new OrderManager();
        String expResult = "";
        String result = instance.getVendorName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendorName method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetVendorName() {
        System.out.println("setVendorName");
        String vendorName = "";
        OrderManager instance = new OrderManager();
        instance.setVendorName(vendorName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendorSearchResults method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetVendorSearchResults() {
        System.out.println("getVendorSearchResults");
        OrderManager instance = new OrderManager();
        List<String> expResult = null;
        List<String> result = instance.getVendorSearchResults();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendorSearchResults method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetVendorSearchResults() {
        System.out.println("setVendorSearchResults");
        List<String> vendorSearchResults = null;
        OrderManager instance = new OrderManager();
        instance.setVendorSearchResults(vendorSearchResults);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewOrderSelectedParts method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetNewOrderSelectedParts() {
        System.out.println("getNewOrderSelectedParts");
        OrderManager instance = new OrderManager();
        List<Part> expResult = null;
        List<Part> result = instance.getNewOrderSelectedParts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewOrderSelectedParts method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetNewOrderSelectedParts() {
        System.out.println("setNewOrderSelectedParts");
        List<Part> newOrderSelectedParts = null;
        OrderManager instance = new OrderManager();
        instance.setNewOrderSelectedParts(newOrderSelectedParts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedPartNumber method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetSelectedPartNumber() {
        System.out.println("getSelectedPartNumber");
        OrderManager instance = new OrderManager();
        String expResult = "";
        String result = instance.getSelectedPartNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedPartNumber method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetSelectedPartNumber() {
        System.out.println("setSelectedPartNumber");
        String selectedPartNumber = "";
        OrderManager instance = new OrderManager();
        instance.setSelectedPartNumber(selectedPartNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedPartRevision method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetSelectedPartRevision() {
        System.out.println("getSelectedPartRevision");
        OrderManager instance = new OrderManager();
        int expResult = 0;
        int result = instance.getSelectedPartRevision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedPartRevision method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetSelectedPartRevision() {
        System.out.println("setSelectedPartRevision");
        int selectedPartRevision = 0;
        OrderManager instance = new OrderManager();
        instance.setSelectedPartRevision(selectedPartRevision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedVendorPartNumber method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetSelectedVendorPartNumber() {
        System.out.println("getSelectedVendorPartNumber");
        OrderManager instance = new OrderManager();
        Long expResult = null;
        Long result = instance.getSelectedVendorPartNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedVendorPartNumber method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetSelectedVendorPartNumber() {
        System.out.println("setSelectedVendorPartNumber");
        Long selectedVendorPartNumber = null;
        OrderManager instance = new OrderManager();
        instance.setSelectedVendorPartNumber(selectedVendorPartNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFindVendorTableDisabled method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetFindVendorTableDisabled() {
        System.out.println("getFindVendorTableDisabled");
        OrderManager instance = new OrderManager();
        Boolean expResult = null;
        Boolean result = instance.getFindVendorTableDisabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFindVendorTableDisabled method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetFindVendorTableDisabled() {
        System.out.println("setFindVendorTableDisabled");
        Boolean findVendorTableDisabled = null;
        OrderManager instance = new OrderManager();
        instance.setFindVendorTableDisabled(findVendorTableDisabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartsTableDisabled method, of class OrderManager.
     */
    @org.junit.Test
    public void testGetPartsTableDisabled() {
        System.out.println("getPartsTableDisabled");
        OrderManager instance = new OrderManager();
        Boolean expResult = null;
        Boolean result = instance.getPartsTableDisabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartsTableDisabled method, of class OrderManager.
     */
    @org.junit.Test
    public void testSetPartsTableDisabled() {
        System.out.println("setPartsTableDisabled");
        Boolean partsTableDisabled = null;
        OrderManager instance = new OrderManager();
        instance.setPartsTableDisabled(partsTableDisabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
