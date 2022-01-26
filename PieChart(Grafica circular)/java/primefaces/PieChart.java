package primefaces;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@ViewScoped
public class PieChart implements Serializable {

    private PieChartModel pieModel;

    public int mercedes;
    public int volvo;
    public int bmw ;

    @PostConstruct
    public void init() {
        createPieModels();
    }

       public int getVolvo() {
        return volvo;
    }

    public void setVolvo(int volvo) {
        this.volvo = volvo;
    }
    
    public int getMercedes() {
        return mercedes;
    }

    public void setMercedes(int mercedes) {
        this.mercedes = mercedes;
    }

 

    public int getBmw() {
        return bmw;
    }

    public void setBmw(int bmw) {
        this.bmw = bmw;
    }

    private void createPieModels() {
        createPieModel();
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public void createPieModel() {
        pieModel = new PieChartModel();

        pieModel.set("Mercedess", 0);
        pieModel.set("BMW", 0);
        pieModel.set("Volvo", 0);
        pieModel.setTitle("Car Brands");
        pieModel.setLegendPosition("c");

    }

    public void drawingPie() {
        
       
        pieModel.set("Mercedess", mercedes);
        pieModel.set("BMW", bmw);
        pieModel.set("Volvo", volvo);
    }

}
