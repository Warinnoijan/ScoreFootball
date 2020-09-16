
package scorefootball;
import java.beans.*;
import java.io.Serializable;
/**
 *
 * @author warin
 */
public class boundpropt implements Serializable{
    public static final String INPUTVALUE_PROPERTY = "inputValue";
    
    private String inputValue;
    
    private PropertyChangeSupport propertySupport;
    
    public boundpropt() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getInputValue() {
        return inputValue;
    }
    
    public void setInputValue(String inputValue) {
        String oldValue = this.inputValue;
        this.inputValue = inputValue;
        propertySupport.firePropertyChange(INPUTVALUE_PROPERTY, oldValue, this.inputValue);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
