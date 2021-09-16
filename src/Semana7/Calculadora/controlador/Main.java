/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7.Calculadora.controlador;

import Semana5.Calculadora.modelo.CalculadoraModelo;
import Semana5.Calculadora.vista.CalculadoraVista;

/**
 *
 * @author gabri
 */
public class Main {
    
    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraModelo modelo = new CalculadoraModelo();
        
        CalculadoraControlador cont = new CalculadoraControlador(vista, modelo);
         cont.iniciar();
        
    }
    
}
