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
public class Vehiculo {
 
    private String nombre;
 
    public void info() {
        System.out.println("Mensaje desde Vehiculo");
    }
 
    public static void main(String[] args) {
        Aereo a1 = new Aereo();
        a1.info();
        Moto m1 = new Moto();
        m1.info();
    }
}
 
class Terrestre extends Vehiculo {
}
 
class Aereo extends Vehiculo {
 
    @Override
    public void info() {
        super.info();
        System.out.println("Mensaje desde Aereo");
    }
}
 
class Moto extends Terrestre{
   @Override
    public void info() {
        super.info();
        System.out.println("Mensaje desde Moto");
    }
}
