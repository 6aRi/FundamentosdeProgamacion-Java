/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Biblioteca {
    //Atributos
    public static ArrayList<Material> libros; //Arreglo dinamico de "materiales"
    private int cantidadLibros = 0;
    private int secuenciaID = 0;
    
    //Constructor //para llenar el array
    public Biblioteca(){
        libros = new ArrayList<Material>();
        Material m1 = new Material(secuenciaID, "1984","FR2","Orwells",1945);
        libros.add(m1);
        secuenciaID++;
        cantidadLibros++;
    }
    
    public void agregar(String t, String c, String a, int anio){
        Material m = new Material(secuenciaID,t,c,a,anio);
        libros.add(m);
        secuenciaID++;
        cantidadLibros++;
    }
    
    public static Object[][] listar(){
        Object[][] tabla = new Object[libros.size()][5];//5 columna pq ya sabemos cuantos datos tiene
        
        int contador = 0;
        for(Material i: libros){//Tipo de dato e instancia: var que vamos a recorrer
            tabla[contador][0]= i.getId();
            tabla[contador][1]= i.getTitulo();
            tabla[contador][2]= i.getCodigo() ;
            tabla[contador][3]= i.getAutor();
            tabla[contador][4]= i.getAnio();
            contador++;
        }
        
        return tabla;

    }

    boolean get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object[][] obtenerPorId (int id){
        Object [][] tabla = new Object [1][5];
        for(Material i: libros){//Tipo de dato e instancia: var que vamos a recorrer
            if(i.getId() == id){
                tabla[0][0]= i.getId();
                tabla[0][1]= i.getTitulo();
                tabla[0][2]= i.getCodigo() ;
                tabla[0][3]= i.getAutor();
                tabla[0][4]= i.getAnio();
            }           
        }
        return tabla;
    }
    
    
    public void modificar(int id,String t, String c, String a, int anio){
        for (Material i: libros){
            if(i.getId() == id){
                i.setTitulo(t);
                i.setCodigo(c);
                i.setAutor(a);
                i.setAnio(anio);
            }
        }
    }
    
    public void eliminar(int id){
        for (Material i: libros){
            if(i.getId() == id){
                libros.remove(i);
                cantidadLibros--;
                break;
            }
        }
    }
        
}
