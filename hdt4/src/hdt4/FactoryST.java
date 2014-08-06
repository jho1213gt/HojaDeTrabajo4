
package hdt4;

/**
 *
 * @author GNXN000000
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
