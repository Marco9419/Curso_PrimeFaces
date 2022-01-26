
package primefaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
public class Area {
    
    private LineChartModel drawArea;
    
    @PostConstruct
    public void init(){
        createDrawArea();
    }
    
    public LineChartModel getDrawArea(){
        return drawArea;
    }
    
    private void createDrawArea(){
        drawArea = new LineChartModel();
        LineChartSeries boys = new LineChartSeries();
        boys.setFill(true);
        boys.setLabel("Boys");
        boys.set("2010", 140);
        boys.set("2011", 120);
        boys.set("2012", 64);
        boys.set("2013", 170);
        boys.set("2014", 45);
        boys.set("2015", 150);
        
        LineChartSeries girls = new LineChartSeries();
        girls.setFill(true);
        girls.setLabel("Girls");
        girls.set("2010", 72);
        girls.set("2011", 80);
        girls.set("2012", 130);
        girls.set("2013", 110);
        girls.set("2014", 140);
        girls.set("2015", 100);
        
        drawArea.addSeries(boys);
        drawArea.addSeries(girls);
        
        drawArea.setTitle("Area Chart");
        drawArea.setLegendPosition("ne");
        drawArea.setStacked(true);
        drawArea.setShowPointLabels(true);
        
        Axis xAxis = new CategoryAxis("Years");
        drawArea.getAxes().put(AxisType.X, xAxis);
        
        Axis yAxis = drawArea.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(300);
        
    }
    
}
