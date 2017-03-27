/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import com.jordan.cih.Relatorio;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jordan-Not
 */
public class ArCondicionado implements Observer {
    public static final double TEMPERATURA_MEDIA = 25;
    private static double temperaturaExternaTotal = 0;
    private static int qtdPessoasTotal = 0;
    private static double temperaturaSala = 0;

    @Override
    public void update(Observable obs, Object obj) {
        SensorPessoa sensorPessoa;
        SensorTemp sensorTemperatura;

        if (obs instanceof SensorPessoa) {
            sensorPessoa = (SensorPessoa) obs;            
            qtdPessoasTotal = (qtdPessoasTotal + sensorPessoa.getQtdPessoa()) / 3;
        } else {
            sensorTemperatura = (SensorTemp) obs;            
            temperaturaExternaTotal = (temperaturaExternaTotal + sensorTemperatura.getTemperatura()) / 3;
        }
        
        temperaturaSala = (temperaturaExternaTotal + qtdPessoasTotal) / 2;
        
        Relatorio.relatorio(temperaturaSala, temperaturaExternaTotal, qtdPessoasTotal);
    }

    public static double getTemperaturaSala() {
        return temperaturaSala;
    }   

}
