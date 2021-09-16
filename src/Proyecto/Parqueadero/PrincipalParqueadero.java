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
public class PrincipalParqueadero {
    public static void main(String[] args) throws InterruptedException {
        //Vehiculo v1 = new Vehiculo("LPD875");
        //System.out.println(v1.ingreso);
        
        Carro c1 = new Carro("LPO 987");
        System.out.println(c1.info());
        //Thread.sleep(60100);
        System.out.println(c1.pago());
        
        Parqueadero p1 = new Parqueadero(5,3,2000,1000);
        System.out.println(p1.imprimeVacios());
        
        System.out.println(p1.parqueaVehiculo(0, 1, 1, "HYI265"));
        System.out.println(p1.imprimeVacios());
        System.out.println(p1.parqueaVehiculo(1, 1, 2, "FRT85"));
        System.out.println("**************");
        System.out.println(p1.estadoParqueadero());
        
    }
}
