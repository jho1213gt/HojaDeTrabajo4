/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
   * @InterfazGrafica.java  1.0 06/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 Estructura de Datos
   * Autor: Alejandro Carné: 13082
   *		Ricardo Franco Carné: 13261
   *		Kuk Ho Chung Carné: 13279
   * Stack: saca y guarda datos en la pila
   *
   */
public interface Stack<E> 
{

   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack

}
