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
 * Clase Factory para seleccion o enlace para cual utilizar de los varios metodos que existen
 */
public class FactoryST<E> {

public InterfaceStack<E> getStack(String entry){
    if(entry.equals("AL"))
        return new ArrayListST<E>();
    if(entry.equals("VE"))
        return new StackST<E>();
    else
        return new ListST<E>();
    }

public InterfaceList<E> getList(String enter){
    if(enter.equals("SL"))
        return new SingularLinkLI<E>();
    if(enter.equals("DL"))
        return new DualLinkLI<E>();
    else
        return new CircleLinkLI<E>();
    }

}
