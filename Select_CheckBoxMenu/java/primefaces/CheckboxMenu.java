package primefaces;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxMenu {

    private String[] selected;
    private List<String> cities;

    @PostConstruct
    public void init() {
        cities = new ArrayList<>();
        cities.add("Greater Noida");
        cities.add("New Delhi");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Newyork");
        cities.add("California");
        cities.add("Shanghai");
    }

    public String[] getSelected() {
        return selected;
    }

    public void setSelected(String[] selected) {
        this.selected = selected;
    }
    
    

    public List<String> getCities() {
        return cities;
    }

}
