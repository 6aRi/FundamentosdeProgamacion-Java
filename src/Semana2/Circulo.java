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
public class Circulo {
    
    //Atriburtos
    private double radio;
    
    //constructor 1
    public Circulo(){ ///inicializar ATRIBUTOS DE CADA INSTANCIA
        this.radio = 1;
    }
    
    //constructor 2
    public Circulo(double r){ ///inicializar
        this.radio = r;
    }
    
    //constructor 2
    public Circulo(double r, double t){ ///inicializar
        this.radio = r*t;
    }
    
    //metodos
    public double getRadio(){
        return this.radio;
    }
    
    public double getPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
}
