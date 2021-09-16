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
public class Arreglos {
    public static void main(String[] args) {
        //arrEstatico();
        //arrEj();
        dosDim();
    }
    
    public static void arrEstatico(){
        int [] edades = new int[5]; // int edades[]: same// 5 posiciones/ int=n.int debe coincidir
        String [] nombres = new String[5]; //se inicializan con str[null] y int[0]
        
        System.out.println(edades[2]);//arreglo[posicion]
        //System.out.println(edades[10]);//out of bounds
        
        nombres[2]="laura"; //asignación
        
        for(String i:nombres){
            System.out.println("Arreglo nombres 1: "+i);
        }
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("Arreglo nombres 2: "+nombres[i]);
        }
    }
    
    public static void arrEj(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();
        int [] arreglo_usr = new int [num];
        System.out.println("Arreglo de "+num+" posiciones");
        for (int i=0; i< arreglo_usr.length;i++){
            System.out.println(arreglo_usr[i]=5);
        }
    }
    
    public static void dosDim() {
        Scanner scan= new Scanner(System.in);
        int[][] arr_empresas_edades = new int[2][5]; 
        for(int i=0; i<arr_empresas_edades.length; i++){
            System.out.println("--Ingresando datos de la empresa" +i+ "--"); 
            for(int j=0; j<arr_empresas_edades[0].length; j++){
                System.out.print("Ingresando edad empleado"+j+ " - ");
                System.out.println("empresa "+i+ " :");
                arr_empresas_edades[i][j] = scan.nextInt();
            }
        }
        
        for (int i=0; i<arr_empresas_edades.length; i++){
            System.out.println("--Empresa"+i+"--");
            for (int j=0; j<arr_empresas_edades[0].length; j++){
                System.out.println("Edad empleado "+j+" : ");
                System.out.println(arr_empresas_edades[i][j]);
            }
        }
    }
}
