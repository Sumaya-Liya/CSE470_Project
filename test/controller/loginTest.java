/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class loginTest {
    login log;
    
    
    public loginTest() {
    }
    
    @Before
    public void setUp() {
        log = new login();
        
    }
    
    @After
    public void tearDown() {
        log = null;
    }

    /**
     * Test of main method, of class login.
     */
    @Test
    public void testname() {
        String name="admin";
        String n= log.name(name);
        assertEquals("admin", n);
        
    }
    @Test
    public void testpassword() {
        String passw = "pass";
        String p=log.password(passw);
        assertEquals("pass",p);
    }
    
}
