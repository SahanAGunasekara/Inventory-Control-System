/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author My Pc
 */
public class SignInTest {
    
    public SignInTest() {
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
     * Test of getEmployeeEmail method, of class SignIn.
     */
    @Test
    public void testGetEmployeeEmail() {
        System.out.println("getEmployeeEmail");
        String expResult = "";
        String result = SignIn.getEmployeeEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeEmail method, of class SignIn.
     */
    @Test
    public void testSetEmployeeEmail() {
        System.out.println("setEmployeeEmail");
        String EmployeeEmail = "";
        SignIn.setEmployeeEmail(EmployeeEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SignIn.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SignIn.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
