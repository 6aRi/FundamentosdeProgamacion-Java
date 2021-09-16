/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Empleado;

/**
 *
 * @author gabri
 */
public class PrincipalHerencia {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Pancho xd");
        e1.setEmpresa("Claro");
        System.out.println(e1.getEmpresa());
        System.out.println(e1.getNombre());
        System.out.println(e1.toString());
        
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        ea1.setNombre("Pepe");
        ea1.setEmpresa("Ecopetral");
        ea1.setSalario(2000);
        System.out.println(ea1.toString());
        
        
        Persona persona1 = new Empleado();
        persona1.setNombre("Luisa");
        //persona1.setEmpresa("Google");//No se puede acceder a metodos del tipo actual
        
        Empleado temp = (Empleado) persona1; //Casting
        temp.setEmpresa("MinTIC");
        System.out.println(temp.toString());
        
        Persona persona2 = new EmpleadoAsalariado();
        EmpleadoAsalariado eaa1 = (EmpleadoAsalariado) persona2; //Casting al tippo actual
        eaa1.setNombre("a");
        eaa1.setEmpresa("b");
        eaa1.setSalario(100);
        System.out.println(eaa1.toString());
        
    }
}
