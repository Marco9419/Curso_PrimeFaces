
package primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Password {
    
    private String passwordFiel1;
    private String passwordFiel2;

    public String getPasswordFiel1() {
        return passwordFiel1;
    }

    public String getPasswordFiel2() {
        return passwordFiel2;
    }

    public void setPasswordFiel1(String passwordFiel1) {
        this.passwordFiel1 = passwordFiel1;
    }

    public void setPasswordFiel2(String passwordFiel2) {
        this.passwordFiel2 = passwordFiel2;
    }
    
    
    
}
