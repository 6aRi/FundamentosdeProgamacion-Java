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
public class MainBanco {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("1234", "John", 50000, 7000);
        c.depositar(600000);
        //System.out.println(c.getNumeroCuenta()+" "+ c.getNombrePropietario()+" "+  c.getSaldo() +" "+ c.getCuotaManejo() );
        c.cobrarCuotaManejo();
        //System.out.println(c.getNumeroCuenta()+" "+ c.getNombrePropietario()+" "+  c.getSaldo() +" "+ c.getCuotaManejo() );
        c.retirar(150000);
        //System.out.println(c.getNumeroCuenta()+" "+ c.getNombrePropietario()+" "+  c.getSaldo() +" "+ c.getCuotaManejo() );
        
        CuentaAhorro ca = new CuentaAhorro("4567", "pancho", 100000);
        System.out.println(ca.getNumeroCuenta()+" "+ ca.getNombrePropietario()+" "+  ca.getSaldo() +" "+ ca.getIEA() );
        ca.depositar(100000);
        System.out.println(ca.getNumeroCuenta()+" "+ ca.getNombrePropietario()+" "+  ca.getSaldo() +" "+ ca.getIEA() );
        ca.pagarInteres(10);
        System.out.println(ca.getNumeroCuenta()+" "+ ca.getNombrePropietario()+" "+  ca.getSaldo() +" "+ ca.getIEA() );
        ca.retirar(120000);
        System.out.println(ca.getNumeroCuenta()+" "+ ca.getNombrePropietario()+" "+  ca.getSaldo() +" "+ ca.getIEA() );
       
    }
    
}
