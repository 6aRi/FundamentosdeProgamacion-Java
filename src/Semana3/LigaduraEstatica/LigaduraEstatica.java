/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.LigaduraEstatica;

/**
 *
 * @author gabri
 */
public class LigaduraEstatica {
    public static void main(String[] args) {
        Persona2 p1 = new Empleado2();
        Empleado2 e1 = new Empleado2();
        
        Persona2.hola();
        Empleado2.hola();
        
        p1.info();//ligadura dinamica
        p1.hola(); //ligadura estatica para metodos estaticos y atributos 
        
        System.out.println("Variable x: "+ p1.x);//los atributos funcionan como ligadura estatica
    }
}

class Persona2{
    int x=2;
    public static void hola(){
        System.out.println("Hola desde persona");
    }
    
    public void info (){
        System.out.println("Hola desde persona");
    }
}

class Empleado2 extends  Persona2{
    int x=3;
    public static void hola(){
        System.out.println("Hola desde Empleado");
    }
    
    public void info (){
        System.out.println("Hola desde Empleado");
    }
}