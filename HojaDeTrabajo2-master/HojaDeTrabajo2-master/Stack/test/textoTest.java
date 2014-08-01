/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejo
 */
public class textoTest {
    
    public textoTest() {
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

    /**
     * Test of leer method, of class texto.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        String nombreArchivo = "";
        texto instance = new texto();
        instance.leer(nombreArchivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Operacion method, of class texto.
     */
    @Test
    public void testOperacion() {
        System.out.println("Operacion");
        int dato1 = 2;
        int dato2 = 5;
        char op = '+';
        int expResult = 7;
        int result = texto.Operacion(dato1, dato2, op);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
