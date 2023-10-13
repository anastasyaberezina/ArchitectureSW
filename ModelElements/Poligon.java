// Содержит список поинтов

package progectarch1.ModelElements;

import progectarch1.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points){
        this.points = points;
    }  
}
