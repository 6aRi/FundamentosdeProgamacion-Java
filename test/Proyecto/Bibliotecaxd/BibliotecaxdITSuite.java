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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gabri
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Proyecto.Bibliotecaxd.BibliotecaLoginIT.class, Proyecto.Bibliotecaxd.BibliotecaIT.class, Proyecto.Bibliotecaxd.PrincipalMaterialIT.class, Proyecto.Bibliotecaxd.BibliotecaGUIIT.class, Proyecto.Bibliotecaxd.MaterialIT.class})
public class BibliotecaxdITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
