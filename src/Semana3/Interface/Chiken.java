/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Interface;

import Semana3.JuegoAnimales.AnimalAbstracta;

/**
 *
 * @author gabri
 */
public class Chiken extends AnimalAbstracta implements Comestible {

    @Override
    public String comer() {
        Comestible.imprimir();
        return "Variable "+VARIABLE;
    }

    @Override
    public void hola() {
        System.out.println("Hola");;
    }

    @Override
    public void sonido() {
        System.out.println("Choy Choy");
    }
    
    
}
