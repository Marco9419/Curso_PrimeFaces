
package primefaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.context.FacesContext;



@ManagedBean
public class commandLink {
    
    public void buttonAction(ActionEvent actionEvent){
        
        addMessage("You just clicked a link");
        
    }
    
    public void addMessage(String summary){
        
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
    
    
}
