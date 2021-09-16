/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

/**
 *
 * @author gabri
 */
public class Vehiculo {
    public String nombre;
    private int precio;

    public int getPrecio() { //indicar el tipo de dato que devuelve (retorno) 
        return this.precio;
    }

    public void setPrecio(int precio) { //void para cuando no se devuelve nada pq solo asigna (No retorno)
        this.precio = precio;
    }
}

