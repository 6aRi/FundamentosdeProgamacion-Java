/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.JuegoAnimales;

/**
 *
 * @author gabri
 */
public class Gato extends AnimalAbstracta {
    public Gato(String nombre){
        this.setNombre(nombre);
    }
    
    public void sonido(){
        System.out.println("miau miau");
    }
}
