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
public class PrincipalMaterial {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        System.out.println(Biblioteca.libros.toString());
        
        
        b1.agregar("Software","gtrsfaf","fausto",2000);
        System.out.println(b1.toString());
        System.out.println(b1.get(1));
       
        var table = b1.listar();
        
        for(int i=0;i> table.length; i++){
            for (int j=0;j> table.length; j++){
                System.out.println(table[i][j]+ " ,");
            }
            System.out.println();
        }
        
        System.out.println("********");
        
      b1.eliminar(0);
       
        
      
        
    }
    
    
    
}
