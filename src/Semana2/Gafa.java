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
public class Gafa {
 
    private String nombre;
    private double precio;
    public final static double IVA = 0.19; //variables constantes con "fibal"
    public static int ENVIO = 2000;  //en mayusculas para indicar que son constantes
    //LAS VAR STATICAS SIRVEN PARA QUE SE comparta A TODAS LOS OBJETOS
 
    public Gafa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
 
    public double precioConIva() {
        //double iva = 0.19;
        double total = this.precio + (this.precio * IVA);
        return total;
    }
 
    public double precioConIvaEnvio() {
        //double iva = 0.19;
        //double envio = 2000;
        double total = this.precio + (this.precio * IVA) + ENVIO;
        return total;
    }
    
    public static void imprimirDatos(){
        System.out.println("Iva: "+IVA);
        System.out.println("Envio: "+ENVIO);
    }
 
}
