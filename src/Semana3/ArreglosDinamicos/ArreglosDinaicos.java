/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.ArreglosDinamicos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class ArreglosDinaicos {
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<Integer>();
        
        edades.add(18);
        edades.add(24);
        edades.add(13);
        
        System.out.println(edades.get(1));
        System.out.println(edades.get(2));
        System.out.println(edades.get(0));
        
        edades.set(2, 45);
        
        System.out.println(edades.get(2));
        
        System.out.println("Tamaño: "+edades.size());
        
        edades.remove(1);
        
        System.out.println(edades.toString());
        
        for (Integer i: edades){
            System.out.println(i);            
        }
        
        System.out.println("Posicion 45: "+edades.indexOf(45));
        
        Integer[] object = edades.toArray(new Integer[0]);
        
    }
}
