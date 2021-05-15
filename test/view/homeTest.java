/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class homeTest {
    
    home h;
    
    public homeTest() {
    }
    
    @Before
    public void setUp() {
        h = new home();
    }
    
    @After
    public void tearDown() {
        h = null;
    }

    @Test
    public void testadd() {
        int a = 20, b = 30, c;
        c=h.add(a, b);
        assertEquals(50,c);
        
    }
    
}
