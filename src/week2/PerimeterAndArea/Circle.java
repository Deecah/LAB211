package week2.PerimeterAndArea;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    double pi = Math.PI;
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double calPeri(double r){
        double p = r*2*pi;
        return p;
    }
    
    public double calArea(double r){
        double a = r*r*pi;
        return a;
    }

    @Override
    public void printResult() {
         System.out.println("----- Circle -----");
        System.out.println("Radius:" + radius
                + "\nPerimeter:" + calPeri(radius)
                + "\nArea:" + calArea(radius));
    }
    
    
    
}
