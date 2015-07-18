/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.app;

import com.jordan.cdp.ArCondicionado;
import com.jordan.cdp.*;

/**
 *
 * @author Jordan-Not
 */
public class App {

    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();
        

        SensorPessoa sensorPessoa1 = new SensorPessoa();
        sensorPessoa1.addObserver(arCondicionado);

        SensorPessoa sensorPessoa2 = new SensorPessoa();
        sensorPessoa2.addObserver(arCondicionado);

        SensorPessoa sensorPessoa3 = new SensorPessoa();
        sensorPessoa3.addObserver(arCondicionado);

        SensorTemp sensorTemp1 = new SensorTemp();
        sensorTemp1.addObserver(arCondicionado);

        SensorTemp sensorTemp2 = new SensorTemp();
        sensorTemp2.addObserver(arCondicionado);

        SensorTemp sensorTemp3 = new SensorTemp();
        sensorTemp3.addObserver(arCondicionado);
        
        
        sensorPessoa1.addPessoa();
        sensorTemp1.setTemperatura(36.2);

    }

}
