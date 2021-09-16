/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Parqueadero;

import java.text.SimpleDateFormat;
import java.util.Date;
 
public abstract class Vehiculo {
 
    public String placa;
    public Date ingreso;
    public final static String PATTERN = "yyyy-MM-dd HH:mm";
 
    public Vehiculo(String p) {
        this.placa = p;
        this.ingreso = new Date();
    }
 
    public String info() { 
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);
        String date = simpleDateFormat.format(this.ingreso);
        return "Placa: " + this.placa + ", Fecha de ingreso: " + date;
    }
 
    public abstract String pago();
}
 