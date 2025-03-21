
package week8.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        
        Cube cube = new Cube();
        cube.setEdge(6);
        
        Sphere s = new Sphere();
        s.setRadius(3);
        
        Square square = new Square();
        square.setEdge(9);
        
        Tetrahedron t = new Tetrahedron();
        t.setEdge(7);
        
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        
        System.out.println("Circle area: " +c.calArea());
        System.out.println("");
        System.out.println("Cube area: " +cube.calArea());
        System.out.println("Cube volume: " +cube.calVolume());
        System.out.println("");
        System.out.println("Sphere area: " +s.calArea());
        System.out.println("Sphere area: " +s.calVolume());
        System.out.println("");
        System.out.println("Square area: " +square.calArea());
        System.out.println("");
        System.out.println("Tetrahedron area: " +t.calArea());
        System.out.println("Tetrahedron volume: " +t.calVolume());
        System.out.println("");
        System.out.println("Triangle area: " +triangle.calArea());
        
    }
}
