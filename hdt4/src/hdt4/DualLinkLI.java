
package hdt4;

/**
 *
 * @author GNXN000000
 */
public abstract class DualLinkLI<E> extends AbsList<E>{

protected int count;
protected DualNode<E> head;
protected DualNode<E> tail;    
    
public DualLinkLI()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DualNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DualNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DualNode<E> temp = tail;
   tail = tail.previousElement ;
   if (tail == null) {
       head = null;
   } else {
       tail = tail.nextElement ;
   }
   count--;
   return temp.data;
}
}
