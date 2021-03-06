/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Bibliotecaxd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class BibliotecaIT {
    
    public BibliotecaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

@Test
    public void testAgregar() {
        System.out.println("agregar");
        String t = "A";
        String c = "B";
        String a = "C";
        int anio = 5;
        Biblioteca instance = new Biblioteca();
        assertNotNull(instance);
        instance.agregar(t, c, a, anio);
        assertEquals(2,Biblioteca.libros.size());
        int ultimo = Biblioteca.libros.size()-1;
        assertEquals("A",Biblioteca.libros.get(ultimo).getTitulo());
        assertEquals("B",Biblioteca.libros.get(1).getCodigo());
        assertEquals("C",Biblioteca.libros.get(1).getAutor());
        assertEquals(5,Biblioteca.libros.get(1).getAnio());
        //fail("The test case is a prototype.");
    }


    @Test
    public void testListar() {
        System.out.println("listar");
        Object[][] expResult = {{0, "1984","FR2","Orwells",1945},{1,"A","B","C",5}};
        Object[][] result = Biblioteca.listar();
        assertArrayEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.get(i);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerPorId() {
        System.out.println("obtenerPorId");
        int id = 0;
        Biblioteca instance = new Biblioteca();
        Object[][] expResult = null;
        Object[][] result = instance.obtenerPorId(id);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModificar() {
        System.out.println("modificar");
        int id = 0;
        String t = "";
        String c = "";
        String a = "";
        int anio = 0;
        Biblioteca instance = new Biblioteca();
        instance.modificar(id, t, c, a, anio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        Biblioteca instance = new Biblioteca();
        instance.eliminar(id);
        fail("The test case is a prototype.");
    }
    
}
