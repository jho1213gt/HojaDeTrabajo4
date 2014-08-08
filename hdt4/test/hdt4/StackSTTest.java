/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de Datos
 * Seccion 30
 * Miembros
 * -Kuk Ho Chung
 * -Jose Sagastume 
 */
package hdt4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GNXN000000
 */
public class StackSTTest {
    
    public StackSTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of push method, of class StackST.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackST instance = new StackST();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class StackST.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackST instance = new StackST();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackST.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackST instance = new StackST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
