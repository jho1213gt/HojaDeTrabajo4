/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GNXN000000
 */
public class InterfazRadioTest {
    
    public InterfazRadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of cambiarFrecuencia method, of class InterfazRadio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frecuencia = false;
        InterfazRadio instance = new InterfazRadioImpl();
        instance.cambiarFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class InterfazRadio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        InterfazRadio instance = new InterfazRadioImpl();
        double expResult = 0.0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class InterfazRadio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        InterfazRadio instance = new InterfazRadioImpl();
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class InterfazRadio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        InterfazRadio instance = new InterfazRadioImpl();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class InterfazRadio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double estacion = 0.0;
        InterfazRadio instance = new InterfazRadioImpl();
        instance.guardar(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class InterfazRadio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        InterfazRadio instance = new InterfazRadioImpl();
        double expResult = 0.0;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class InterfazRadio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        InterfazRadio instance = new InterfazRadioImpl();
        double expResult = 0.0;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class InterfazRadio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        InterfazRadio instance = new InterfazRadioImpl();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class InterfazRadio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        InterfazRadio instance = new InterfazRadioImpl();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionAM method, of class InterfazRadio.
     */
    @Test
    public void testGetEstacionAM() {
        System.out.println("getEstacionAM");
        InterfazRadio instance = new InterfazRadioImpl();
        double expResult = 0.0;
        double result = instance.getEstacionAM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionFM method, of class InterfazRadio.
     */
    @Test
    public void testGetEstacionFM() {
        System.out.println("getEstacionFM");
        InterfazRadio instance = new InterfazRadioImpl();
        double expResult = 0.0;
        double result = instance.getEstacionFM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfazRadioImpl implements InterfazRadio {

        public void cambiarFrecuencia(boolean frecuencia) {
        }

        public double sacar(int boton) {
            return 0.0;
        }

        public void apagar() {
        }

        public void encender() {
        }

        public void guardar(int boton, double estacion) {
        }

        public double subirEstacion() {
            return 0.0;
        }

        public double bajarEstacion() {
            return 0.0;
        }

        public boolean getFrecuencia() {
            return false;
        }

        public boolean getEncendido() {
            return false;
        }

        public double getEstacionAM() {
            return 0.0;
        }

        public double getEstacionFM() {
            return 0.0;
        }
    }
    
}
