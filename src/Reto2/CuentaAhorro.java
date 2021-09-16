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
public class CuentaAhorro extends CuentaBanco {
    //Atributos
    public double IEA;
    public int i;
    
    //Constructor
    public CuentaAhorro(String nc, String np, double s){
        super(nc, np, s);
        this.setIEA(this.getIEA());        
    }
    
    //Metodos
    
    public double getIEA(){
        double valor = 0;
        if(getSaldo()<1000000){
            valor = 0.01;
        }else if (1000000 <= getSaldo() && getSaldo() < 2000000){
            valor = 0.0175;
        }else if (getSaldo() >= 2000000){
            valor = 0.023;
        }else{
            System.out.println("Saldo Negativo");
        }
        return valor;
    }
    
    public void pagarInteres(int dias){
        for (i =1; i <= dias; i++ ){
            setSaldo(getSaldo()*(1+(getIEA()/365)));
            //setSaldo(getSaldo() + inte);           
        }       
    }

    public void setIEA(double IEA) {
        this.IEA = IEA;
    }    
}
