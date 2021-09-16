/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Parqueadero;

/**
 *
 * @author gabri
 */
public class Parqueadero {
    public int pisos;
    public int espacios;
    public int cantidadParqueados;
    public int historial;
    public Vehiculo[][] matriz;
    
    //Constructor
    public Parqueadero(int pis, int esp, int prc, int prm){
        this.pisos = pis;
        this.espacios = esp;
        Carro.precio = prc;
        Moto.precio = prm;
        this.matriz = new Vehiculo[pis][esp];
    }
    
    public String imprimeVacios (){
        String info = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]==null){
                    info = info +"Piso: "+ (i+1) + " Espacio: " + j + "-VACIO \n";
                }
            }
        }
        return info;
    }
    
    public String parqueaVehiculo(int p, int e, int tipo, String placa){
        try{
        if(matriz[p][e]== null){
            switch(tipo){
                case 1:
                    matriz[p][e] = new Carro(placa);
                    break;
                case 2:
                    matriz[p][e] = new Moto(placa);
                    break;
                default:
                    return "Opcion desconocida";
            }
        }else {
            return "Lugar no disponible";
        }
        } catch (Exception exep){// Exeption es una clase en java
            return "Pisoy espacio ingreasado no existe";
        }
        
        return "Vehiculo parqueado";
    }
    
    public String estadoParqueadero(){
        String info = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]==null){
                    info = info +"Piso: "+ (i+1) + " Espacio: " + j + "-VACIO \n";
                }else {
                    info = info +"Piso: "+ (i+1) + " Espacio: " + j + " - "+matriz[i][j].info();
                }
                
            }
        }      
        return info;
    }
}
