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
public class SensorPessoa extends Observable{
    private int qtdPessoa;

    public SensorPessoa() {
        this.qtdPessoa = 0;
    }

    public int getQtdPessoa() {
        return qtdPessoa;
    }
    
    public void addPessoa(){
        this.qtdPessoa++;
        setChanged();
        notifyObservers();
    }
    
    public void removePessoa(){
        if(qtdPessoa > 0){
            this.qtdPessoa--;
            setChanged();
            notifyObservers();
        }
        
    }
}
