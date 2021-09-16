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
public class MainAnimalesconPolimorfismo {
     public static void main(String[] args) {
        Gato g1 = new Gato("Ozzy");
        Gato g2 = new Gato("Jackie");
        Gato g3 = new Gato("Michi");
        Perro p1 = new Perro("Trosqui");
        Perro p2 = new Perro("Firulais");
        Perro p3 = new Perro("Galaxia");
        Conejo c1 = new Conejo("Buzz");
        Conejo c2 = new Conejo("Sñr. Bigotes");
        Conejo c3 = new Conejo("BAD");
 
        AnimalAbstracta[] animales = {g1,g2,g3,p1,p2,p3,c1,c2,c3};
        
        
        sonidosAnimales(animales);
 
    }
 
    public static void sonidosAnimales(AnimalAbstracta[] arreglo ){
        for(AnimalAbstracta i: arreglo){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
            //busca el método en el tipo declarado (en tiempo de compilacion) pero ejecuta el tipo actual (en tiempo de ejecucion).
            // Es decir, se debe predisponer el metodo en la clase (y se deja vacio) y desarrollarlo en la subclase.
        }
    }
 
   
}
