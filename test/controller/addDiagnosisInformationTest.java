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
public class addDiagnosisInformationTest {
    addDiagnosisInformation diagnosis;
    
    
    public addDiagnosisInformationTest() {
    }
    
    @Before
    public void setUp() {
        diagnosis = new addDiagnosisInformation();
    }
    
    @After
    public void tearDown() {
        diagnosis= null;
    }

    @Test
    public void testdiagnosis_info() {
        int a=2, b=3, result;
        result= diagnosis.diagnosis_info(a, b);
        assertEquals(10,result);
    }
    
}
