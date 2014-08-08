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
public class SingularLinkLITest {
    
    public SingularLinkLITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of size method, of class SingularLinkLI.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SingularLinkLI instance = new SingularLinkLI();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class SingularLinkLI.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        SingularLinkLI instance = new SingularLinkLI();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class SingularLinkLI.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        SingularLinkLI instance = new SingularLinkLI();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
