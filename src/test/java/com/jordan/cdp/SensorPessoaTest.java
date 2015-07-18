/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class SensorPessoaTest {

    private SensorPessoa sensorPessoa;

    @Before
    public void before() {
        sensorPessoa = new SensorPessoa();
    }

    /**
     * Test of getQtdPessoa method, of class SensorPessoa.
     */
    @Test
    public void testGetQtdPessoa() {
        System.out.println("getQtdPessoa");
        SensorPessoa instance = new SensorPessoa();
        int expResult = 0;
        int result = instance.getQtdPessoa();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPessoa method, of class SensorPessoa.
     */
    @Test
    public void testAddPessoa() {
        System.out.println("addPessoa");
        SensorPessoa instance = new SensorPessoa();
        instance.addPessoa();        
    }

    /**
     * Test of removePessoa method, of class SensorPessoa.
     */
    @Test
    public void testRemovePessoa() {
        System.out.println("removePessoa");
        SensorPessoa instance = new SensorPessoa();
        instance.removePessoa();
    }

}
