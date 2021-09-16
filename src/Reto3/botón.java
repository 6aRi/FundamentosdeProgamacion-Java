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
public abstract class botón {
    //atributos
    public double ancho;
    public double alto;
    public String colorFondo;
    public String colorTexto;
    public String texto;
    
    // constructor

    public botón(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
    }
    
    //metodos
    public abstract void hacerClik();
    
    //Getter & Setter

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
