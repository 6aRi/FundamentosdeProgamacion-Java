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
import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {
        //IfThen();
        //ifAnidado();
        //elif();
        //switchh();
        ejerciciosw();
    }
    
    public static void IfThen(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura: ");
        int temp = entrada.nextInt();
        
        if (temp>27){
            System.out.println("Comprar helado-cerveza");
        }
        System.out.println("Fin programa");
}
    
    public static void IfThenElse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los creditos aprobados: ");
        int creAprobados = scan.nextInt();
        
    }
    
    public static void ifAnidado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura: ");
        int temp = entrada.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese dinero: ");
        int dinero = entrada2.nextInt();
        
        if (temp>27 && dinero >5){
            System.out.println("Comprar helado-cerveza");
        }
        System.out.println("Fin programa");
    }
    
    public static void elif(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura: ");
        int temp = entrada.nextInt();
        
        if (temp>27){
            System.out.println("Comprar helado-cervesa");
        }else if(temp>24){
            System.out.println("Comprar gaseosa");
        }else {
            System.out.println("Comprar Leche");
        }
        
        System.out.println("Fin programa");
    }
    
    public static void switchh(){ //Cases :v
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nota: ");
        int nota = entrada.nextInt();  
        
        switch(nota){
            case 10:
                System.out.println("Teso");
                break;                     //Para que no evalue el siguiente
            case 9:
                System.out.println("Tesito");
                break; 
            case 8:
                System.out.println("Vas bien");
                break;
            default:
                System.out.println("Puedes Mejorar");
        }
    }
    
    public static void ejerciciosw(){ //Cases :v
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        
        System.out.println("Ingrese num1: ");
        int num1 = entrada.nextInt();  
        System.out.println("Ingrese num2: ");
        int num2 = entrada2.nextInt();  
        
        //Menu
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        System.out.println("Ingrese opcion: ");
        int opc = entrada3.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Suma: "+(num1+num2));
                break;                     //Para que no evalue el siguiente
            case 2:
                System.out.println("Resta: "+ (num1-num2));
                break; 
            case 3:
                System.out.println("Multiplicacion: "+ (num1*num2));
                break;
            case 4:
                System.out.println("Division: "+ (num1/num2));
                break;
            default:
                System.out.println("Opción desconocida");
        }
    }
    
    
}