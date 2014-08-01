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
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frecuencia = false;
        Radio instance = new Radio();
        instance.cambiarFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radio instance = new Radio();
        double expResult = 50;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 50);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class Radio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Radio instance = new Radio();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double estacion = 0.0;
        Radio instance = new Radio();
        instance.guardar(boton, estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        Radio instance = new Radio();
        double expResult = 89.8;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 89.8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class Radio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncendido method, of class Radio.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean encendido = false;
        Radio instance = new Radio();
        instance.setEncendido(encendido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class Radio.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class Radio.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 0.0;
        Radio instance = new Radio();
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF1 method, of class Radio.
     */
    @Test
    public void testGetF1() {
        System.out.println("getF1");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF1 method, of class Radio.
     */
    @Test
    public void testSetF1() {
        System.out.println("setF1");
        double f1 = 0.0;
        Radio instance = new Radio();
        instance.setF1(f1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF2 method, of class Radio.
     */
    @Test
    public void testGetF2() {
        System.out.println("getF2");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF2 method, of class Radio.
     */
    @Test
    public void testSetF2() {
        System.out.println("setF2");
        double f2 = 0.0;
        Radio instance = new Radio();
        instance.setF2(f2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF3 method, of class Radio.
     */
    @Test
    public void testGetF3() {
        System.out.println("getF3");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF3();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF3 method, of class Radio.
     */
    @Test
    public void testSetF3() {
        System.out.println("setF3");
        double f3 = 0.0;
        Radio instance = new Radio();
        instance.setF3(f3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF4 method, of class Radio.
     */
    @Test
    public void testGetF4() {
        System.out.println("getF4");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF4();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF4 method, of class Radio.
     */
    @Test
    public void testSetF4() {
        System.out.println("setF4");
        double f4 = 0.0;
        Radio instance = new Radio();
        instance.setF4(f4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF5 method, of class Radio.
     */
    @Test
    public void testGetF5() {
        System.out.println("getF5");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF5();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF5 method, of class Radio.
     */
    @Test
    public void testSetF5() {
        System.out.println("setF5");
        double f5 = 0.0;
        Radio instance = new Radio();
        instance.setF5(f5);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF6 method, of class Radio.
     */
    @Test
    public void testGetF6() {
        System.out.println("getF6");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF6();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF6 method, of class Radio.
     */
    @Test
    public void testSetF6() {
        System.out.println("setF6");
        double f6 = 0.0;
        Radio instance = new Radio();
        instance.setF6(f6);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF7 method, of class Radio.
     */
    @Test
    public void testGetF7() {
        System.out.println("getF7");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF7();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF7 method, of class Radio.
     */
    @Test
    public void testSetF7() {
        System.out.println("setF7");
        double f7 = 0.0;
        Radio instance = new Radio();
        instance.setF7(f7);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF8 method, of class Radio.
     */
    @Test
    public void testGetF8() {
        System.out.println("getF8");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF8();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF8 method, of class Radio.
     */
    @Test
    public void testSetF8() {
        System.out.println("setF8");
        double f8 = 0.0;
        Radio instance = new Radio();
        instance.setF8(f8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF9 method, of class Radio.
     */
    @Test
    public void testGetF9() {
        System.out.println("getF9");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF9();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF9 method, of class Radio.
     */
    @Test
    public void testSetF9() {
        System.out.println("setF9");
        double f9 = 0.0;
        Radio instance = new Radio();
        instance.setF9(f9);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF10 method, of class Radio.
     */
    @Test
    public void testGetF10() {
        System.out.println("getF10");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF10();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF10 method, of class Radio.
     */
    @Test
    public void testSetF10() {
        System.out.println("setF10");
        double f10 = 0.0;
        Radio instance = new Radio();
        instance.setF10(f10);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF11 method, of class Radio.
     */
    @Test
    public void testGetF11() {
        System.out.println("getF11");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF11();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF11 method, of class Radio.
     */
    @Test
    public void testSetF11() {
        System.out.println("setF11");
        double f11 = 0.0;
        Radio instance = new Radio();
        instance.setF11(f11);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF12 method, of class Radio.
     */
    @Test
    public void testGetF12() {
        System.out.println("getF12");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getF12();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF12 method, of class Radio.
     */
    @Test
    public void testSetF12() {
        System.out.println("setF12");
        double f12 = 0.0;
        Radio instance = new Radio();
        instance.setF12(f12);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionAM method, of class Radio.
     */
    @Test
    public void testGetEstacionAM() {
        System.out.println("getEstacionAM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionAM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacionAM method, of class Radio.
     */
    @Test
    public void testSetEstacionAM() {
        System.out.println("setEstacionAM");
        double estacionAM = 0.0;
        Radio instance = new Radio();
        instance.setEstacionAM(estacionAM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionFM method, of class Radio.
     */
    @Test
    public void testGetEstacionFM() {
        System.out.println("getEstacionFM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionFM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacionFM method, of class Radio.
     */
    @Test
    public void testSetEstacionFM() {
        System.out.println("setEstacionFM");
        double estacionFM = 0.0;
        Radio instance = new Radio();
        instance.setEstacionFM(estacionFM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
