/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class SensorTempTest {
    private SensorTemp sensorTemp;   
    
    @Before
    public void before() {
        sensorTemp = new SensorTemp();
    }

    /**
     * Test of getTemperatura method, of class SensorTemp.
     */
    @Test
    public void testGetTemperatura() {
        System.out.println("getTemperatura");
        SensorTemp instance = new SensorTemp();
        double expResult = 0.0;
        double result = instance.getTemperatura();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTemperatura method, of class SensorTemp.
     */
    @Test
    public void testSetTemperatura() {
        System.out.println("setTemperatura");
        double temperatura = 0.0;
        SensorTemp instance = new SensorTemp();
        instance.setTemperatura(temperatura);
    }
    
}
