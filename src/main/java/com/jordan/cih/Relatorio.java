/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cih;

/**
 *
 * @author Jordan-Not
 */
public class Relatorio {

    public static void relatorio(double tempSala, double tempExterna, double qtdPessoas) {
        System.out.println("");
        System.out.println("Relatorio Ar Condicionado: ");
        System.out.println("    - Temperatura externa total = " + tempExterna);
        System.out.println("    - Quantidade de pessoas na sala = " + qtdPessoas);
        System.out.println("    - Temperatura na sala = " + tempSala);
        System.out.println("");

        System.out.println("Abaixando a temparatura em " + getRegulagem(tempSala) + " graus!");
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
        }
        System.out.println("Temperatura Atualizada!");
    }
    
    public static double getRegulagem(double tempSala){
        return tempSala - 25;
    } 

}
