/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd.modelo;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class conexion {
    private static final String SERVIDOR = config.SERVIDOR;
    private static final int PUERTO = config.PUERTO;
    private static final String BD = config.BD;
    private static final String NOMBRE_USUARIO = config.NOMBRE_USUARIO;
    private static final String CONTRASEÑA_USUARIO = config.CONTRASEÑA_USUARIO;
    
    public static Connection getConexion() throws SQLException{
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName(SERVIDOR);
        ds.setPortNumber(PUERTO);
        ds.setDatabaseName(BD);
        ds.setUser(NOMBRE_USUARIO);
        ds.setPassword(CONTRASEÑA_USUARIO);
        
        Connection con = ds.getConnection();
        return con;       
    }
    
}
