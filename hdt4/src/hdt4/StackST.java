
package hdt4;

import java.util.Vector;
/**
 *
 * @author GNXN000000
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
