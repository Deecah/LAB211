package week8.Shapes;

import static java.lang.Math.pow;

//hình lập phương
public class Cube extends ThreeDShape {

    private double edge;

    public Cube() {
    }
    
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    

    @Override
    public double calArea() {
        return pow(edge, 2) * 6;
    }

    @Override
    public double calVolume() {
        return pow(edge, 3);
    }

}
