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
public class Cadenas {
    public static void main(String[] args) {
        //Concatenar();
        //Met();
        
    }
    
    public static void Concatenar(){
        String mensaje = "Bienvenido a Java";
        //"+"= suma y concatenar (var1+""+var2)
        //las cadenas funcionan como un arreglo [0,n]: |H|O|L|A| |M|U|N|D|O|
        
        int num1=2, num2=3;
        String str1 = "num1 + num2 =";
        String str2 = " = num1 + num2";
        System.out.println(str1 + num1 + num2);//concateno
        System.out.println(num1 + num2 + str2);//opero
        System.out.println(str1 + (num1 + num2));
    }
    
    public static void Met(){
        String mensaje = "Bienvenido a Java!";
        String mensaje2 = "bienvenido a java!";
        
        //Plotear elemento en posicion conocida
        int ultimaPosicion = mensaje.length() -1;
        System.out.println("Longitud: "+mensaje.length());
        System.out.println("ChartAt: "+mensaje.charAt(ultimaPosicion)); 
        
        //Para buscar la primera posicion de un caracter = .indexOf
        System.out.println("Index a despues de pos12: "+mensaje.indexOf("a",12));// busca despues de ese indice
        System.out.println("Index x: "+mensaje.indexOf("x"));
        System.out.println("Index nido: "+mensaje.indexOf("nido")); // ES SENSIBLE A MINISCULAS
        
        String mensajeMayuscula = mensaje.toUpperCase();//cONVERTIR A MAYUSCULAS
        System.out.println("Index NIDO: "+mensajeMayuscula.indexOf("NIDO")); // ES SENSIBLE A MINISCULAS
        
        // Para buscar ultima posicion de caracter
        System.out.println("Index a: "+mensaje.lastIndexOf("a"));
        System.out.println("Index a despues de ant13: "+mensaje.lastIndexOf("a",13));// busca antes de ese indice - es inclusivo
        System.out.println("Index en: "+mensaje.lastIndexOf("en"));
        
        //Extraer tring en un rango de posiciones
        System.out.println(mensaje.substring(0,10));//Obtiene el string hasta antes de la posicion mencionada
        System.out.println(mensaje.substring(10));// de la posicion en adelante
    
        //Comparacion de strings
        System.out.println("Equals: "+mensaje.equals(mensaje2));//sensible a minuscula
        System.out.println("Equals Ignore Case: "+mensaje.equalsIgnoreCase(mensaje2));
    }
}
