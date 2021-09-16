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
public class MaterialIT {
    
    public MaterialIT() {
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
    public void testGetId() {
        System.out.println("getId");
        Material instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Material instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Material instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Material instance = null;
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        Material instance = null;
        int expResult = 0;
        int result = instance.getAnio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Material instance = null;
        instance.setTitulo(titulo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Material instance = null;
        instance.setCodigo(codigo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        Material instance = null;
        instance.setAutor(autor);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 0;
        Material instance = null;
        instance.setAnio(anio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Material instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
