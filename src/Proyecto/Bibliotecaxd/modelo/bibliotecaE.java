/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd.modelo;

/**
 *
 * @author gabri
 */
public class bibliotecaE {
    
    private int id;
    private String nombre;

    //Constructor
    public bibliotecaE(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //SETTER & GETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Metodo
     public String toString(){
         return this.id+" - "+this.nombre;
     }
    
    
    
}
