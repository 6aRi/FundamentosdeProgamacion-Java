/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Interface;

/**
 *
 * @author gabri
 */
public interface Comestible {//solo contiene metodos publicos abstractos y constantes (final)
    
    public final int VARIABLE = 1;   //Constante
    public abstract String  comer(); //Abstracto
    public static void imprimir (){ //Estatico
        System.out.println("imprimir");
    }
    public void hola();// por defecto es un abstract ya que la clase es interface (implicitamente)
    
    default void metodo(){  // Default
        System.out.println("Hola");
    }
}
