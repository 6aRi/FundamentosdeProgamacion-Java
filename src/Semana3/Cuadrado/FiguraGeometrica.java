/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Cuadrado;

/**
 *
 * @author gabri
 */
public class FiguraGeometrica {
    public int lado;

    public FiguraGeometrica (int lado) {
        this.lado = lado;
    }
    
    public double CalcularArea(){
        double a = this.lado*this.lado ;
        return a;
        
    }
    
}
