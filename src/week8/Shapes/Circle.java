
package week8.Shapes;

import static java.lang.Math.pow;

public class Circle extends TwoDShape{
    private double radius;

    public Circle() {
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calArea() {
        return 3.14*pow(radius,2);
    }
    
    
    
}
