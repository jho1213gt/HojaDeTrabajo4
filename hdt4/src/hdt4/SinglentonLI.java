
package hdt4;

/**
 *
 * @author GNXN000000
 */
public class SinglentonLI {
    
private static SinglentonLI instance = null;
   protected SinglentonLI() {
      // Exists only to defeat instantiation.
   }
   public static SinglentonLI getInstance() {
      if(instance == null) {
         instance = new SinglentonLI();
      }
      return instance;
   }    
    
}
