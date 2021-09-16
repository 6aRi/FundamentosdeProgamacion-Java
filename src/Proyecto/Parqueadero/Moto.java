/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Parqueadero;

import java.util.Date;

     
import java.util.Date;
 
 
public class Moto extends Vehiculo{
 
    public static int precio;
 
    public Moto(String p) {
        super(p);
    }
 
    @Override
    public String info(){
        return "MOTO - "+ super.info();
    }
 
    @Override
    public String pago() {
        Date hoy = new Date();
       
        double tiempoTranscurrido = (hoy.getTime()-super.ingreso.getTime())/60000;
        double precioTotal = tiempoTranscurrido * precio;
        return "La Moto de placa "+super.placa+", lleva "+tiempoTranscurrido+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
 
}