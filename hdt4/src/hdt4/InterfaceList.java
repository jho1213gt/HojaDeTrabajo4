/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de Datos
 * Seccion 30
 * Miembros
 * -Kuk Ho Chung
 * -Jose Sagastume 
 */
package hdt4;

import java.util.Iterator;

/**
 *
 * @author GNXN000000
 */
public interface InterfaceList<E> {
    
 public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list



}
