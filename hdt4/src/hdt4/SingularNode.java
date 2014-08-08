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

/**
 *
 * @author GNXN000000
 * Clase para la lista que utiliza los nodos singulares
 */
public class SingularNode<E> {
   protected E data; // value stored in this element
   protected SingularNode<E> nextElement; // ref to next

   public SingularNode(E v, SingularNode<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public SingularNode(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   public SingularNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   public void setNext(SingularNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }    
}
