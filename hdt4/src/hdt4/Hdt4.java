/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de Datos
 * Seccion 30
 * Miembros
 * -Kuk Ho Chung
 * -Jose Sagastume 
 * Referencia: Duane A. Bailey. (2007). Java Structures: Data Structructures in Java for the Principled Programmer. Edicion sqrt(7)
 * Ejemplos de Factory, Singular/Double/Circle Link con Nodos y Listas referenciado a los de Blackboard de frame de Algoritmos y Estructuras de Datos
 * Ejemplo de Singleton: http://migranitodejava.blogspot.com/2011/05/singleton.html / http://www.javaworld.com/article/2073352/core-java/simply-singleton.html
 */

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
        
        /**
         * Uso de Singlenton (Patron de Disenio) para instanicicar la clase, que en este es calculadora, para asegurar que exista sola una 
         * sin tener que llamar de diferentes formas varias veces
         */
        SinglentonLI FabSin = SinglentonLI.getInstance();
        
        /**
         * Uso de Factory para poder escoger a cual metodo de Stack y lista utuilzar 
         */
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
        
        /**
         * Parte para reconocer la parte de lectura de texto
         */
        texto T = new texto();		
	T.leer("C:\\Users\\usuario\\Documents\\GitHub\\HojaDeTrabajo4\\hdt4\\src\\Formulas.txt");    
    }
        
}
