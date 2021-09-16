/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3.Empleado;

/**
 *
 * @author gabri
 */
public class Faculty extends Employee{
      public static void main(String[] args) {
        new Faculty();
    }
 
    public Faculty(){
        System.out.println("(*) Performs Faculty's tasks");
    }
}
 
class Employee extends Person
{
 
    public Employee()
    {
        this("(*) Invoke Employee's overloaded constructor");
        System.out.println("(*) Performs Employee's tasks");
    }
 
    public Employee(String s)
    {
        System.out.println(s);
    }
}
 
class Person
{
    public Person()
    {
        System.out.println("(*) Performs Person's tasks");
    }
}
