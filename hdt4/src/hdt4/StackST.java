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

import java.util.Vector;
/**
 *
 * @author GNXN000000
 * Clase de stack que utiliza el vector 
 */
public class StackST<E> extends Vector<E> implements InterfaceStack<E> {

    protected Vector<E> data;
    private int contador=0;
    
    public StackST(){
	// post: constructs a new, empty stack
		data = new Vector<E>();
        }
    
      public void push(E item){
        data.addElement(item);
        contador=contador+1;
    }

    public E pop(){       
        return data.remove(0);
        
    }

    public E peek(){
       return data.elementAt(contador);       
    }

    public boolean empty(){
        data.clear();
        return false;
    }

    public int size() 
    {
        return contador;
    }    
}
