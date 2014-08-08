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
 * Clase abstracta para la interfaz de las listas con metodos comunmente compartidos
 */
public abstract class AbsList<E> implements InterfaceList<E>{
    
  public AbsList(){
   // post: does nothing
   }

   public boolean isEmpty(){
   // post: returns true iff list has no elements
      return size() == 0;
   }
  
    
}
