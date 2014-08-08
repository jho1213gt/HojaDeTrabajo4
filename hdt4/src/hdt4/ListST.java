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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 *
 * @author GNXN000000
 * clase de stack que utiliza los metodos de la lista en general
 */
public class ListST<E> implements InterfaceStack<E> {
 
    protected List<E> data;
    private int contador=0;
    
    public ListST(){
	// post: constructs a new, empty stack
		data = new List<E>() {

                    @Override
                    public int size() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean isEmpty() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean contains(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public Iterator<E> iterator() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public Object[] toArray() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public <T> T[] toArray(T[] ts) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean add(E e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean remove(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean containsAll(Collection<?> clctn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean addAll(Collection<? extends E> clctn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean addAll(int i, Collection<? extends E> clctn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean removeAll(Collection<?> clctn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean retainAll(Collection<?> clctn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void clear() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public E get(int i) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public E set(int i, E e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void add(int i, E e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public E remove(int i) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public int indexOf(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public int lastIndexOf(Object o) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public ListIterator<E> listIterator() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public ListIterator<E> listIterator(int i) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public List<E> subList(int i, int i1) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
        }
    
   
	public void push(E item){
	// post: the value is added to the stack
	// will be popped next if no intervening push
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
