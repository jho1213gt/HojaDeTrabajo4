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
import java.util.ArrayList;
/**
 *
 * @author GNXN000000
 * Clase para el Stack que utiliza lista de los arreglos
 */
public class ArrayListST<E> implements InterfaceStack<E> {
	protected ArrayList<E> data;

	public ArrayListST(){
	// post: constructs a new, empty stack
                data = new ArrayList<E>();
	}

	public void push(E item){
	// post: the value is added to the stack
	//          will be popped next if no intervening push
		data.add(item);
	}

	public E pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returne
		return data.remove(size()-1);
	}

	public E peek(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get(size() - 1);
	}
	
	public int size(){
	// post: returns the number of elements in the stack
		return data.size();
	}
  
	public boolean empty(){
	// post: returns true if and only if the stack is empty
		return size() == 0;
	}    
}
