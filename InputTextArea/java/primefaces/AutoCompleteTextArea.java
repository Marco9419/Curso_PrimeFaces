package primefaces;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutoCompleteTextArea {

    public List<String> sugessions(String str) {

        ArrayList<String> list = new ArrayList<>();

        if (str.equals("Marco")) {

            list.add("Linares Hernandez");
            list.add("Sanchez Garcia");
            list.add("Lara Gonzalez");
            list.add("Esquivel Corral");
            list.add("Montejo Torres");
            
        }else{
            list.add("Java point" + str);
        }
        
        return list;
    }

}
