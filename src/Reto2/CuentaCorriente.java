/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

/**
 *
 * @author gabri
 */
public class CuentaCorriente extends CuentaBanco {
    //Atributos
    private double cuotaManejo;
    
    //Constructor
    public CuentaCorriente(String nc, String np, double s, double cm){
        super(nc, np, s);
        this.cuotaManejo = cm;        
    }
    
    //Metodos
    public void cobrarCuotaManejo(){        
        this.setSaldo(this.getSaldo()- cuotaManejo);
    }

    public double getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }
    
    
    
    
}
