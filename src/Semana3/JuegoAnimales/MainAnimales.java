/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.JuegoAnimales;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class MainAnimales {
    public static void main(String[] args) {
        Gato g1 = new Gato("Ozzy");
        Gato g2 = new Gato("Jackie");
        Gato g3 = new Gato("Michi");
        Perro p1 = new Perro("Trosqui");
        Perro p2 = new Perro("Firulais");
        Perro p3 = new Perro("Galaxia");
 
        Gato[] gatitos = {g1,g2,g3};
        Perro[] perritos = {p1,p2,p3};
 
        
        Gato[] gatitos2 = new Gato[3];
        gatitos2[0]=g1;
        
         
        //Areglo dinamico el emboltorio debe ser un dato no primitivo
        ArrayList<Gato> gatitos3 = new ArrayList<Gato>();
        gatitos3.add(g1);
        gatitos3.add(g2);
        gatitos3.add(g3);
        
        ArrayList<Perro> perritos2 = new ArrayList<Perro>();
        perritos2.add(p1);
        perritos2.add(p2);
        perritos2.add(p3);
        
        sonidosGatos(gatitos3);
        sonidosPerros(perritos2);
        
 
    }
 
    public static void sonidosGatos(ArrayList<Gato> gatitos3){
        for(Gato i: gatitos3){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
 
    public static void sonidosPerros(ArrayList<Perro> perritos2){
        for(Perro i: perritos2){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
 
}
