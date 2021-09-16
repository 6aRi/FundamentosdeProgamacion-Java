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
public class CuentaBanco {
    //Atributos
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;
    
    //Constructor
    public CuentaBanco(String nc, String np, double s){
        this.setNumeroCuenta(nc);
        this.setNombrePropietario(np);
        this.setSaldo(s);        
    }
    //Métodos
    public void depositar(double c){
        this.setSaldo(this.getSaldo()+c);
    }
    
    public void retirar (double c){       
        double comision = c * 0.05;
        if (this.getSaldo() >= c + comision){
            this.setSaldo(this.getSaldo()-c-comision);
        }else {
            System.out.println("No hay fondos suficientes");
        }        
    }
    
    
    //Getters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Setters

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
