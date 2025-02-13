package week2.PerimeterAndArea;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double calPeri(double a, double b, double c) {
        double p = a + b + c;
        return p;
    }

    public double calArea(double a, double b, double c) {
        double n = (a + b + c) / 2;
        double area = sqrt(n * (n - a) * (n - b) * (n - c));
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("----- Triangle -----");
        System.out.println("Side a:" + a
                + "\nSide b:" + b
                + "\nSide c:" + c
                + "\nPerimeter:" + calPeri(a, b, c)
                + "\nArea:" + calArea(a, b, c));

    }

}
