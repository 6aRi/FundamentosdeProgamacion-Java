/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

/**
 *
 * @author gabri
 */
public class PrincipalCirculo {
    public static void main(String[] args) {
        Circulo circulo1;
        circulo1 = new Circulo();
        
        Circulo circulo2 = new Circulo();
        
        Circulo circulo3 = new Circulo(5);
        
        Circulo circulo4 = new Circulo(5,5);
        
        System.out.println("radio circulo 1 antes de cambiar: "+circulo1.getRadio());
        circulo1.setRadio(9);
        circulo2.setRadio(2);
    
        System.out.println("radio circulo 1 : "+circulo1.getRadio());
        System.out.println("perimetro circulo 1 : "+circulo1.getPerimetro());
        
        System.out.println("CURCULO 4: "+circulo4.getRadio());
        
    }
    
    
}
