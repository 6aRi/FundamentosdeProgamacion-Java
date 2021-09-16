/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

/**
 *
 * @author gabri
 */
public class Principal {
    
    public static void main(String[] args) {
        Nomina n1 = new Nomina();
        Trabajador t1 = new Trabajador("Daniel","72023394",70000.0,96,31,8,1981);
        Trabajador t2 = new Trabajador("Mat","1037681391",67000.0,80,23,1,2000);
        Trabajador t3 = new Trabajador("Johan","33277591",20000.0,96,24,5,1970);
        Trabajador t4 = new Trabajador("Paulo","1032678245",40000.0,96,7,3,2001);
        
        System.out.println(n1.getTrabajadores().size());
        n1.agregarTrabajador(t1);
        n1.agregarTrabajador(t2);
        n1.agregarTrabajador(t3);
        n1.eliminarTrabajador("123456789");
        //System.out.println(n1.getTrabajadores().size());
        n1.agregarTrabajador(t4);
        //System.out.println(n1.getTrabajadores().size());
        n1.eliminarTrabajador("72023394");
        //System.out.println(n1.getTrabajadores().size());
                
        System.out.println(n1.salarioQuincenalTrabajador("72023394"));
        String ID = "72023394";
        System.out.println(ID.equals(t1.getCC()));
        System.out.println(t1.salarioQuincenal());
        
        
        
        var table = n1.listar();
        
        for(int i=0;i> table.length; i++){
            for (int j=0;j> table.length; j++){
                System.out.println(table[i][j]+ " ,");
            }
            System.out.println();
        }

        //System.out.println(t1.getNombre()+t1.getDiaNacimiento()+t1.getMesNacimiento()+t1.getYearNacimiento());
        
        
       
        System.out.println(n1.calcularSalarioQuincenalNomina());
        System.out.println(n1.promedioEdadNomina());
        System.out.println(t1.calcularEdad());
        System.out.println(n1.desviacionEstandarEdadNomina());
        
    }
}
