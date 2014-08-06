
package hdt4;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author GNXN000000
 */
public class Hdt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryST<String> sFactory = new FactoryST<String>();
            System.out.println("Ingrese el parametro de Stack que desea utilizar: ");
            System.out.println("ArrayList, ingresar AL");
            System.out.println("Vector, ingresar VE");
            System.out.println("Lista, ingresar L");
            String entry = "";
            Scanner inScanner = new Scanner(System.in);
            entry = inScanner.nextLine();
            entry.toUpperCase();
        InterfaceStack<String> miStack = sFactory.getStack(entry);
        
            System.out.println("Ingrese el parametro de listas que desea utilizar: ");
            System.out.println("Singular Link, ingresar SL");
            System.out.println("double Link, ingresar DL");
            System.out.println("Circle Link, ingresar CL");
            String enter = "";
            Scanner inTScanner = new Scanner(System.in);
            enter = inTScanner.nextLine();
            enter.toUpperCase();
        InterfaceStack<String> myStack = sFactory.getStack(enter);        
        
        texto T = new texto();		//leendo el .txt
	T.leer("C:\\Users\\usuario\\Documents\\GitHub\\HojaDeTrabajo4\\hdt4\\src\\Formulas.txt");    
    }
        
}
