package week8.Shapes;

//tứ diện

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Tetrahedron extends ThreeDShape {

    private double edge;

    public Tetrahedron() {
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    

    @Override
    public double calArea() {
        return sqrt(3) * edge * edge;
    }

    @Override
    public double calVolume() {
        return (1.0 / 12.0) * sqrt(2) * pow(edge, 3);
    }

}
