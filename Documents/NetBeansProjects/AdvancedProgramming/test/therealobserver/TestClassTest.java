/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package therealobserver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author said_rasinlic
 */
public class TestClassTest {
    
    public TestClassTest() {
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
     * Test of m1 method, of class TestClass.
     */
    @Test
    public void testM1() throws Exception {
        System.out.println("m1");
        TestClass instance = new TestClass();
        instance.m1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of m2 method, of class TestClass.
     */
    @Test
    public void testM2() {
        System.out.println("m2");
        char c = ' ';
        char[] cA = null;
        TestClass instance = new TestClass();
        instance.m2(c, cA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TestClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
