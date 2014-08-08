/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de Datos
 * Seccion 30
 * Miembros
 * -Kuk Ho Chung
 * -Jose Sagastume 
 */

package hdt4;
import java.util.ArrayList;
/**
 *
 * @author GNXN000000
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
