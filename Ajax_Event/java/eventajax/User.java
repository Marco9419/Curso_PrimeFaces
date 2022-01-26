
package eventajax;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class User implements Serializable{
    
    
    String name;
    String last;
   // String lastName;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    
}
