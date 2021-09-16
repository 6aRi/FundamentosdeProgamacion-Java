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
public class Buque extends Maritimo {
    //Constructor
    public Buque (String n, double p) {
        super(n,p);
    }
    
    @Override
    public double getPrecio(){
        return super.getPrecio()+40;
    }
}
    
    
