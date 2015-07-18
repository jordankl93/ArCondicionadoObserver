/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import java.util.Observable;

/**
 *
 * @author Jordan-Not
 */
public class SensorTemp extends Observable{
    private double temperatura;

    public SensorTemp() {
        this.temperatura = 0;
    }
    
    public double getTemperatura(){
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        
        setChanged();
        notifyObservers();
    }
    
}
