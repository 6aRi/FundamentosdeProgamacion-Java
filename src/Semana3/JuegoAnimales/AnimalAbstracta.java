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
public abstract class AnimalAbstracta {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void sonido(); //CLASE ABSTRACTA: instrumento de herencia (no se instanca en la calse animal). NO tiene Cuerpo. se define como protegido
        
   

}
