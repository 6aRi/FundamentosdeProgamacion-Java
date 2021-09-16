/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Triangulo;

import Semana3.Cuadrado.FiguraGeometrica;

/**
 *
 * @author gabri
 */
public class Triangulo extends FiguraGeometrica {
    
    public Triangulo (int lado){
        super(lado);
    }
    
    public double calcularArea(){
        double a= Math.sqrt(3.0)/4* super.CalcularArea();
        return a;
    }
    
}
