
package scorefootball;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/**
 *
 * @author warin
 */
public class register2 implements PropertyChangeListener {
    
     @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: "+evt.getNewValue()); 
    }
    
}
