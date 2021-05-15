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
public class fullHistoryOfPatientTest {
    fullHistoryOfPatient fullHistory;
    
    public fullHistoryOfPatientTest() {
    }
    
    @Before
    public void setUp() {
        fullHistory = new fullHistoryOfPatient();
        
    }
    
    @After
    public void tearDown() {
        fullHistory= null;
    }

    @Test
    public void testhistory() {
        String s = "hospital";
        String st= fullHistory.history(s);
        assertEquals(st,s);
    }
    
}
