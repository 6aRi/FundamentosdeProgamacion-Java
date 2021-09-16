/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Vahiculos;

/**
 *
 * @author gabri
 */
public class Vehiculo3 {
    private String nombre;
    public double Precio;
    
    public Vehiculo3 (String n, double p){
        this.nombre = n;
        this.Precio = p;
             
    }


    public double getPrecio() {
        return Precio;
    }
    
    
}
