
package hdt4;

/**
 *
 * @author GNXN000000
 */
public abstract class AbsList<E> implements InterfaceList<E>{
    
  public AbsList(){
   // post: does nothing
   }

   public boolean isEmpty(){
   // post: returns true iff list has no elements
      return size() == 0;
   }
  
  public boolean contains(E value){
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
	return -1 != indexOf(value);
  }    
    
}