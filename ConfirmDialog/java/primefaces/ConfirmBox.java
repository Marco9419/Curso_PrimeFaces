
package primefaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class ConfirmBox {
    
    public void confirm(ActionEvent actionevent){
        addMessage("Delete record", "Record has been deleted");
    }
    
    public void addMessage(String summary, String details){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, details);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
