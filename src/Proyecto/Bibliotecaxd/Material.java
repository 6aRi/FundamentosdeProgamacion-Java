/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd;

/**
 *
 * @author gabri
 */
public class Material {
    //Atributos
    private int id;
    private String titulo;
    private String codigo;
    private String autor;
    private int anio;
    //public static int contador = 1;
    
    //Constructor
    public Material(int id, String t, String c, String a, int y ){
        //this.id = contador;
        this.id = id;
        this.titulo = t;
        this.codigo =c;
        this.autor = a;
        this.anio = y;
        //contador++;             
    }

    //Metodos
    
    //Getters
    public int getId(){
        return this.id;
    }

    public String getTitulo() {
        return titulo;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }
    
    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
   public String toString(){
      return  this.id +" "+ this.titulo +" "+ this.codigo +" "+ this.autor +" "+this.anio;
   }
    
    
    
}
