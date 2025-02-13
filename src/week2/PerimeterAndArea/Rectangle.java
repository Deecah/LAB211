package week2.PerimeterAndArea;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return length;
    }

    public void setLenght(double length) {
        this.length = length;
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
    
    public double calPeri(double w, double h){
        double p = (w+h)*2 ;
        return p;
    }
    
    public double calArea(double w, double h){
        double a = w*h;
        return a;
    }

    @Override
    public void printResult() {
         System.out.println("----- Rectangle -----");
        System.out.println("Width:" + width
                + "\nHeight:" + length
                + "\nPerimeter:" + calPeri(width, length)
                + "\nArea:" + calArea(width, length));
    }
    
    
    
}
