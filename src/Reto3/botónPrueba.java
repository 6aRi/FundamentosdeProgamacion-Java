/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

/**
 *
 * @author gabri
 */
public class botónPrueba extends botón {

    public botónPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        super(ancho, alto, colorFondo, colorTexto, texto);
    }

    @Override
    public void hacerClik() {
        super.setTexto("Hello World!");
    }
    
}

