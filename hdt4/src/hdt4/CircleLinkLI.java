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
 * clase para la lista que utiliza la forma circular de punteros
 */
public class CircleLinkLI<E> extends AbsList<E> {
  
protected SingularNode<E> tail; 
protected int count;

public CircleLinkLI(){
// pre: constructs a new circular list
   tail = null;
   count = 0;
}

public void addFirst(E value){
// pre: value non-null
// post: adds element to head of list
   SingularNode<E> temp = new SingularNode<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value){
// pre: value non-null
// post: adds element to tail of list
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

public E removeLast(){
// pre: !isEmpty()
// post: returns and removes value from tail of list
   SingularNode<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   SingularNode<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   }
   count--;
   return temp.value();
}    

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
