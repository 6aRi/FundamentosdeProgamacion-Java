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
public class PrincipalGafa {
    public static void main(String[] args) {
        Gafa g1 = new Gafa("RayBan",5000);
        Gafa g2 = new Gafa("Antonio Banderas",3000);
        
        System.out.println(Gafa.ENVIO);
        System.out.println(Gafa.IVA);
        //System.out.println(Gafa.nombre); //se debe indicar la instancia
        //Gafa.IVA = 0.1; //error pq es constante (final)
        Gafa.ENVIO = 4000;
        
        System.out.println(g1.precioConIvaEnvio());
        
        Gafa.imprimirDatos();
    }
}
