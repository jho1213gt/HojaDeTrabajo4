/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt4;

import java.awt.List;

/**
 *
 * @author GNXN000000
 */
public class ListST<E> implements InterfaceStack<E> {
 
    protected ListST<E> data;
    private int contador=0;
    
    public ListST(){
	// post: constructs a new, empty stack
		data = new ListST<E>();
        }
    
   
	public void push(E item){
	// post: the value is added to the stack
	//          will be popped next if no intervening push
		//data.add(item);
	}

	public E pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returne
		//return data.remove(size()-1);
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