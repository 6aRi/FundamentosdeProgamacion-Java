/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabri
 */
public class Trabajador {
    //Atributos
    private String nombre;
    private String CC;
    private double salarioPorHora;
    private int horasTrabajadas;
    private int diaNacimiento;
    private int mesNacimiento;
    private int yearNacimiento;
    
    // Constructor
    public Trabajador(String nombre, String CC, double salarioPorHora, int horasTrabajadas, int diaNacimiento, int mesNacimiento, int yearNacimiento) {
        this.nombre = nombre;
        this.CC = CC;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        if (0<diaNacimiento && diaNacimiento<32){
            this.diaNacimiento = diaNacimiento;
        }else{
            System.out.println("Dia invalido");
        }
        
        if (0<mesNacimiento && mesNacimiento<13){
            this.mesNacimiento = mesNacimiento;
        }else{
            System.out.println("Mes invalido");
        }
        
        if (1900<yearNacimiento && yearNacimiento<3000){
            this.yearNacimiento = yearNacimiento;
        }else{
            System.out.println("Año invalido");
        }
        
        
    }
    
    //metodos
    public double salarioQuincenal(){
        double sq = this.salarioPorHora * this.horasTrabajadas;
        return sq;
    }
    
    public int calcularEdad(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd");
        int diaActual = Integer.valueOf(myDateObj.format(myFormatObj));
        
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MM");
        int mesActual = Integer.valueOf(myDateObj.format(myFormatObj2));
        
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("yyyy");
        int yearActual = Integer.valueOf(myDateObj.format(myFormatObj3));
        
        if(mesActual > mesNacimiento || mesActual == mesNacimiento && diaActual >= diaNacimiento)
            return yearActual - yearNacimiento;
        
        return yearActual - yearNacimiento - 1;
    }
    
    //Getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
    
}
