/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd.controlador;

import Proyecto.Bibliotecaxd.PasswordUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Proyecto.Bibliotecaxd.modelo.*;
 
public class Usuario {
 
    public static void registrarUsuario(String n,String u,String p,int id) throws SQLException {
 
        String llave = PasswordUtils.getSalt(10);
        String clave = PasswordUtils.generateSecurePassword(p, llave);
        System.out.println(llave);
        System.out.println(clave);
 
        Connection con = conexion.getConexion();
        String query = "INSERT INTO empleados (usuario, clave, llave, estado, nombre,tipo_usuario_idtipo_usuario,bibliotecas_idbibliotecas) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
 
        //ResultSet resultado = ps.executeQuery();
 
        con.close();
 
    }
    
    public static void validarUsuario( String usuario){
        
    }
 
}
