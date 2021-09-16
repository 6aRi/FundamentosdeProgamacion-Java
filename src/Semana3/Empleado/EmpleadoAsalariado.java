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
public class EmpleadoAsalariado extends Empleado{
    
    private float salario;
    
    public void setSalario (float s){
        this.salario =s;
    }

    public float getSalario() {
        return salario;
    }
    
    @Override // indicativo para indicar la sobreescritura de un metodo heredado
    public String toString(){
        String texto = "Empleado Asalariado: " + getNombre() + "\n";
        texto = texto +  "Empresa: " + getEmpresa() + "\n";
        texto = texto + "Salario: $" + this.salario;
        return texto;
    }
}
