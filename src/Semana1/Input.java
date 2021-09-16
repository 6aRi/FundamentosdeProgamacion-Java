/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

/**
 *
 * @author gabri
 */


import java.util.Scanner; //importar clase java scanner
public class Input {
    public static void main(String[] args) {
        //EntradadDatos();
        Rectangulo();
    }
    
    public static void EntradadDatos(){
        Scanner entrada = new Scanner(System.in); //Instanciar un objeto de la clase java para un elemnto que recive entrada
        
        System.out.println("Usuario ingrese su nombre");
        String nombre = entrada.next();
        System.out.println("Usuario ingrese su apellido");
        String apellido = entrada.next(); //o next line (con espacios)
        System.out.println("Usuario ingrese su cedula");
        int CC = entrada.nextInt();
        int cedula = Integer.parseInt(entrada.next());//Castear un str to int
        //Double.parseDouble("3.1416")
        // int x= (int)9.78; //solo para numeros
        // int a = Integer.valueof("0"); //Objeto integer
        System.out.println(nombre+" "+apellido+" "+CC);
        
        System.out.println("Usuario ingrese dato");
        //String nombre = entrada.next();
    }
    
    public static void Rectangulo(){
        Scanner entrada = new Scanner(System.in); //Instanciar un objeto de la clase java para un elemnto que recive entrada
        
        System.out.println("Usuario ingrese Base");
        int base = entrada.nextInt();
        System.out.println("Usuario ingrese Altura");
        int altura = entrada.nextInt();
        
        System.out.println("El área del rectangulo es: "+base*altura);
    }
}
