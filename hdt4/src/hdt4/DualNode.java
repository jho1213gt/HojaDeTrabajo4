
package hdt4;

/**
 *
 * @author GNXN000000
 */
public class DualNode<E> {

protected E data;
protected DualNode<E> nextElement;
protected DualNode<E> previousElement;

public DualNode(E v,
                        DualNode<E> next,
                        DualNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DualNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}
}
