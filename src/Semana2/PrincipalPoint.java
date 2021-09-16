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
public class PrincipalPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2,1);
        Point p2 = new Point(4,3);
        
        
        double r1 = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
        
        double r2 = p1.distance(p2.getX(), p2.getY());
                
        double r3 = p1.distance(p2);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        
        Point p3= p1.midPoint(p2);
        System.out.println("Resultado midpx: "+p3.getX());
        System.out.println("Resultado midpy: "+p3.getY());
        System.out.println("toString: "+p3.toString());
    }
}
