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
public class Conejo extends AnimalAbstracta { //debe implementarse los metodos abstractos por obligacion
    
    public Conejo(String nombre){
        this.setNombre(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Que hay de nuevo viejo!");
    }
    
}
