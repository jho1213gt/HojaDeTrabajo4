
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
public class StackVector <E>  extends Vector<E> implements Stack<E>{
   
    protected Vector<E> data;
    private int contador=0;
    
    public StackVector()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
        }
    
    @Override
      public void push(E item) 
    {
        data.addElement(item);
        contador=contador+1;
    }

    @Override
    public E pop() 
    {       
        return data.remove(0);
        
    }

    @Override
    public E peek()
    {
       return data.elementAt(contador);       
    }

    @Override
    public boolean empty() 
    {
        data.clear();
        return false;
    }

    @Override
    public int size() 
    {
        return contador;
    }
    
    
    
    
    
}
