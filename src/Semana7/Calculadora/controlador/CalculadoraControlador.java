/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7.Calculadora.controlador;

import Semana5.Calculadora.modelo.CalculadoraModelo;
import Semana5.Calculadora.vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gabri
 */
public class CalculadoraControlador implements ActionListener {
    private CalculadoraVista vista;
    private CalculadoraModelo modelo;
    
    CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo){
        this.vista = vista;
        this.modelo=modelo;
        this.vista.multiplicar.addActionListener(this);
    }

    
    public void iniciar(){
        this.vista.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        modelo.setNumeroUno(Double.parseDouble(vista.var1.getText()));
        modelo.setNumeroDos(Double.parseDouble(vista.var2.getText()));
        modelo.multiplicar();
        vista.resultado.setText(String.valueOf(modelo.getResultado()));
    }
    
}
