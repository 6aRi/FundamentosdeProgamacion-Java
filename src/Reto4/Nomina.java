/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;


import java.util.ArrayList;


/**
 *
 * @author gabri
 */
public class Nomina{
    
    //Atributos
    public ArrayList<Trabajador> trabajadores; 
    private int contador = 0;
    
    //Constructor
    public Nomina() {
        trabajadores = new ArrayList<Trabajador>();
    }
    
    //Metodos
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
        this.contador++;  
    }

    public void eliminarTrabajador(String ID){
        for (Trabajador i : trabajadores){
            if (ID.equals(i.getCC())){
                this.trabajadores.remove(i);
                break;
            }
        }        
    }
    
    public double calcularSalarioQuincenalNomina(){
        double sum=0;
        for(Trabajador i : trabajadores){
            sum+= i.salarioQuincenal();
        }
        return sum;
    }
    
    public double promedioEdadNomina(){
        double sum=0;
        double siz = this.trabajadores.size();
        for(Trabajador i : trabajadores){
            sum+= i.calcularEdad();
        }
        return sum/siz;
    }
    
    public double desviacionEstandarEdadNomina(){
        double n = this.trabajadores.size();
        double sumatoria=0;
        double prom = promedioEdadNomina();
        for(Trabajador i : trabajadores){
            sumatoria+= Math.pow(i.calcularEdad()- prom ,2);
        }
        double de = Math.sqrt(sumatoria/n);
        return de;
    }
    
    public double salarioQuincenalTrabajador (String ID){
        double sal = 0;
        for (Trabajador i : trabajadores){
            if (ID.equals(i.getCC())){
                sal = i.salarioQuincenal();
                break;
            }else {
                sal=-1;
            }
        }
        return sal;
    }
    
    //SETTER and Getter

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public Object [][] listar(){
        Object [][] tabla = new Object[getTrabajadores().size()][7];//5 columna pq ya sabemos cuantos datos tiene

        int conta = 0;
        for(Trabajador i: trabajadores){
            tabla[conta][0]= i.getNombre();
            tabla[conta][1]= i.getCC();
            tabla[conta][2]= i.getSalarioPorHora() ;
            tabla[conta][3]= i.getHorasTrabajadas();
            tabla[conta][4]= i.getDiaNacimiento();
            tabla[conta][5]= i.getMesNacimiento();
            tabla[conta][6]= i.getYearNacimiento();
            conta++;
        }

        return tabla;
    }
    
    
}
