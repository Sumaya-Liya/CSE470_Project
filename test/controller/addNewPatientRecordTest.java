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
public class addNewPatientRecordTest {
    
    addNewPatientRecord patient;
    
    public addNewPatientRecordTest() {
    }
    
    @Before
    public void setUp() {
        patient = new addNewPatientRecord();

    }
    
    @After
    public void tearDown() {
        patient = null;
    }

    @Test
    public void testpatient_info() {
        int x= 3, result;
        result = patient.patient_info(x);
        assertEquals(9,result);
    }
    
}
