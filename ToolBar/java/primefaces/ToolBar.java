
package primefaces;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean
public class ToolBar {
    
    public void save(ActionEvent actionevent){
        
        addMessage("The Data has been Saved!");
    }
    
    public void update(ActionEvent actionevent){
        
        addMessage("The Data has been Update!");
    }
    
    public void delete(ActionEvent actionevent){
        
        addMessage("The Data has been Delete!");
    }
    
    public void addMessage(String summary){
        
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null,message);
    }
    
}
