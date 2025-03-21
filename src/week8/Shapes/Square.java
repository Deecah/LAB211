
package week8.Shapes;

public class Square extends TwoDShape{
    private double edge;

    public Square() {
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    
    
    @Override
    public double calArea() {
        return edge*edge;
    }
    
    
}
