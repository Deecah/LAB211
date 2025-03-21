package week8.Shapes;

//hình cầu
import static java.lang.Math.pow;

public class Sphere extends ThreeDShape {

    private double radius;

    public Sphere() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    
    @Override
    public double calArea() {
        return radius * 4 * radius * 3.14;
    }

    @Override
    public double calVolume() {
        return (4.0 / 3.0) * 3.14 * pow(radius, 3);
    }

    
}
