package primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Switch {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
