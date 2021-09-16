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
public class Variables {
    public static void main(String[]args){
        tiposVariables();
        EjerciciotiposVariables();
        EjercicioAritmetica();
        operadoresRelacionales();
    }  

    public static void tiposVariables() {
        // es igual que phyton pero se deben declarar primero el tipo de variable
        int edad =5;
        double salario = 46.32;
        boolean miBooleano = true;
        String nombre = "Luisa";

        int x;
        x = 3;

        edad = edad + 8;
        salario =53.1;
        double total = salario + edad;

        int i, j, k;    //Definir multiples variables del mismo tipo
        int h = 4, p = 3; //Asignar valor a multiples variables

        System.out.println("El valor de x es: "+x);
        //System.out.println("El valor de x - %s, salario - %s","+x+","+salario+");
    }

    public static void EjerciciotiposVariables() {
        //Nombre, apellifos,nm ID, Edad, Genero
        String Nombre = "Gabriel";
        String Apellido = "Riaño";
        int ID = 1014298595;
        int Edad = 23;
        String Genero = "M";
        System.out.println(Nombre+" "+Apellido+" "+ID+" "+Edad+" "+Genero);
    }

    public static void EjercicioAritmetica() {
        int a=5, b=3, c=8, d=4, e=2;
        double x = a - (b/c) + ((b-(c/d))/e);
        System.out.println(x);
        System.out.println(Math.pow(5,2));
    }
    
    public static void operadoresRelacionales(){
        int a = 16, c = 4,d = 8, e = 5;
        boolean b = true;
        System.out.println(a>c&&e<=d);
        System.out.println(b||d-e > a/c);
        System.out.println(!b);
        System.out.println(!b && c<d || a/d <= e);
        System.out.println(b^false);
    }
    
    public static void EstructurasSeleccion(){
        //If-then
        
    }
}