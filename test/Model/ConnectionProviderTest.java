/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class ConnectionProviderTest {
    ConnectionProvider Db;
    
    public ConnectionProviderTest() {
    }
    
    @Before
    public void setUp() {
        Db = new ConnectionProvider();

    }
    
    @After
    public void tearDown() {
        Db=null;
    }

    @Test
    public void testGetCon() {
        
        
        
    }

    @Test
    public void testdb() {
        String st ="connected";
        String s= Db.db(st);
        assertEquals(st,s);
    }
    
}
