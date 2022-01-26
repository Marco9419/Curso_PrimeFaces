
package primefaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;


@ManagedBean
public class FileUpload {
    
    
    public void handleFileUpload(FileUploadEvent event ){
        FacesMessage message = new FacesMessage("Successfuly ", event.getFile().getFileName() + " is uploaded");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
