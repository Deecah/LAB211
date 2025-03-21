
package week8.Shapes;

import static java.lang.Math.sqrt;

public class Triangle extends TwoDShape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    
    
    @Override
    public double calArea() {
        double p = (a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
