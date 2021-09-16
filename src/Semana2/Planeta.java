/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class Planeta {
    
    //Atriburtos
    private String nombre;
    private float masa;
    
    //Costructor
    public Planeta(){ ///es un constructor especial y no lleva el type ni void
        this.masa = 4000;
    }
    
    public Planeta(String n, float m){
        this.masa = m;
        this.nombre = n;
    }
    
    
    //Metodos
    public String getNombre(){
        return this.nombre;
    }
    
    public float getMasa(){
        return this.masa;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
   public String setMasa(float masa) {
        String mensaje= "";
        if(masa > 0){
            this.masa = masa;
            mensaje = "Cambio realizado";
        }else{
            mensaje = "Valor inválido";
        }
        return mensaje;
    }
   
    
}
