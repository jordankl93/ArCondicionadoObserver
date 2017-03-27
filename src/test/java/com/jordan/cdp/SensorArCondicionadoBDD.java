/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Jordan-PC
 */
public class SensorArCondicionadoBDD {
    private SensorPessoa sensorPessoa1;
    private SensorTemp  sensorTemp1;
    private ArCondicionado arCondicionado;            

    public SensorArCondicionadoBDD() {
        this.arCondicionado = new ArCondicionado();
        
        this.sensorPessoa1 = new SensorPessoa();
        this.sensorPessoa1.addObserver(arCondicionado);
        
        this.sensorTemp1  = new SensorTemp();
        this.sensorTemp1.addObserver(arCondicionado);
        
    }

    @Given("^Eu adiciono (\\d+) pessoas a um sensor$")
    public void euAdicionoPessoasAUmSensor(int qtdPessoas) throws Throwable {
        this.sensorPessoa1.setQtdPessoa(qtdPessoas);
    }

    @Given("^Eu Tenho uma temperatura externa de (\\d+) Graus em um sensor$")
    public void euTenhoUmaTemperaturaExternaDeGrausEmUmSensor(int temperatura) throws Throwable {
        this.sensorTemp1.setTemperatura(temperatura);
    }

    @When("^Eu quero regular a temperatura$")
    public void euQueroRegularATemperatura() throws Throwable {
                
    }

    @Then("^O ar condicionado deve regular a temperatura em (\\d+\\.\\d+) graus$")
    public void oArCondicionadoDeveRegularATemperaturaEmGraus(double resultadoEsperado) throws Throwable {
        assertThat(ArCondicionado.getTemperaturaSala(), is(resultadoEsperado));
    }

}
