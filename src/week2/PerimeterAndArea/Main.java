package week2.PerimeterAndArea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, r, w, l;
        Scanner sc = new Scanner(System.in);

        w = getValidDouble(sc, "Enter width of rectangle:", "Please enter a number!!!");
        l = getValidDouble(sc, "Enter length of rectangle:", "Please enter a number!!!");
        r = getValidDouble(sc, "Enter radius of circle:", "Please enter a number!!!");
        a = getValidDouble(sc, "Enter side A of triangle:", "Please enter a number!!!");
        b = getValidDouble(sc, "Enter side B of triangle:", "Please enter a number!!!");
        c = getValidDouble(sc, "Enter side C of triangle:", "Please enter a number!!!");

        Rectangle hcn = new Rectangle(w, l);
        Circle ht = new Circle(r);
        Triangle tg = new Triangle(a, b, c);
        
        hcn.printResult();
        ht.printResult();
        tg.printResult();

    }

    public static double getValidDouble(Scanner sc, String message, String errormessage) {
        double num;
        while (true) {
            try {
                System.out.print(message);
                num = Double.parseDouble(sc.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.printf(errormessage);
            }
        }
    }
}
