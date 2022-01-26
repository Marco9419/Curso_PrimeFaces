
package primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Rating {
    
    private Integer rating;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    
}
