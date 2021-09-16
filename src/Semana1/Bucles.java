/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */

public class Bucles {
    public static void main(String[] args) {
        //cicloWhile();
        //cicloWhileconCentinela(); //valores ingresados
        //ejercicioWhile();
        //dowhile();
        //ejercicioDowhile();
        //cicloFor();
        ejercicioFor();
    }
   
    public static void cicloWhile(){
        int i = 0;
        while(i<100){
            System.out.println(i);
            i+= 5;//i=i+1
        }
      
    
        
    }
    
    public static void cicloWhileconCentinela(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = entrada.nextInt(); 
        
        while(num !=0){
            System.out.println("Hola");
            System.out.println("o ingrese cero para salir");
            num= entrada.nextInt(); 
        }
        
        
    }
    
    public static void ejercicioWhile(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num2 = entrada.nextInt();
        int contador = 0;
        while (num2 != 0) {
            contador = contador + num2;
            System.out.println("Contador" + contador);
            System.out.println("Ingrese un número");
            num2 = entrada.nextInt();
        }

    }
    
    public static void dowhile(){//primero instrucciones y luego la condicion
        int i=11;
        do {// ejecutar al menos una vez y luego entra al ciclo
            System.out.println(i);
            i++;
        }while(i<11);
    }
    
    public static void ejercicioDowhile(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int contador = 0;
        int num2;
        
        do{
            System.out.println("Ingrese un número");
            num2 = entrada.nextInt();
            contador = contador + num2;
            System.out.println("Contador" + contador);
        }while (num2 != 0);
        
        }

    public static void cicloFor(){
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 100; i++){
            System.out.println("Bienvenido");
        }
        
        int contador = 0;
        for(int num2 = entrada.nextInt();num2 != 0;num2 = entrada.nextInt()){
            contador = contador + num2;
            System.out.println("Contador" + contador);
            System.out.println("Ingrese un número");
        }

 
    }
    
    public static void ejercicioFor(){
        for (int i=20; i>1; i-=2){
            System.out.println(i);
        }
    }
    }

