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
public class PrincipalPlanetas {
     public static void main(String[] args) {
        Planeta planeta1 = new Planeta();
        Planeta planeta2 = new Planeta();
        Planeta planeta3 = new Planeta("Marte", 5000);
        
        planeta1.setNombre("Venus");
        
        planeta2.setNombre("Jupiter");
        planeta2.setMasa(-6000);
                
        
        System.out.println("P1: "+planeta1.getNombre()+"   "+planeta1.getMasa());
        System.out.println("P2: "+planeta2.getNombre()+"   "+planeta2.getMasa());
        System.out.println("P3: "+planeta3.getNombre()+"   "+planeta3.getMasa());
        
       
    }
}
