package week1;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class Math {

    private int choice;

    public Math() {
    }
    Scanner sc = new Scanner(System.in);

    boolean isPerfectSquare(double number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) sqrt(number);
        return sqrt * sqrt == number;
    }

    void checkNumbers(double... numbers) {
        for (double num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + "  is even");
            }
            if (num % 2 == 1) {
                System.out.println(num + "  is odd");
            }
            isPerfectSquare(num);
        }
    }

    void calculateEquation() {
        System.out.println("Ax+B=0");
        while (true) {
            try {
                System.out.print("Enter A: ");
                double a = Double.parseDouble(sc.nextLine());
                if (a == 0) {
                    System.out.println("A=0 is invalid!!!!");
                    continue;
                }
                System.out.println("Enter B: ");
                double b = Double.parseDouble(sc.nextLine());
                double x = -b / a;
                System.out.println("X=" + x);
                checkNumbers(a, b);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an number.");
            }
        }
    }

    void calculateQuadraticEquation() {
        System.out.println("AX^2 + BX + C = 0");
        while (true) {
            try {
                System.out.print("Enter A: ");
                double a = Double.parseDouble(sc.nextLine());
                if (a == 0) {
                    System.out.println("A=0 is invalid!!!!");
                    continue;
                }
                System.out.println("Enter B: ");
                double b = Double.parseDouble(sc.nextLine());
                System.out.println("Enter C:");
                double c = Double.parseDouble(sc.nextLine());

                double delta = b * b - 4 * a * c;
                if (delta > 0) {
                    double x1 = (-b + sqrt(delta)) / 2 * a;
                    double x2 = (-b - sqrt(delta)) / 2 * a;
                    System.out.println("Solution: X1= " + x1 + " ,X2= " + x2);
                } else if (delta == 0) {
                    double x = -b / 2 * a;
                    System.out.println("Solution: X= " + x);
                } else {
                    System.out.println("Equation have no solution!!!");
                }
                checkNumbers(a, b, c);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an number.");
            }
        }
    }

    void run() {

        while (true) {
            System.out.println("===== Equation Program =====\n"
                    + "1.Calculate Superlative Equation\n"
                    + "2.Calculate Quadratic Equation\n"
                    + "3.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    calculateEquation();
                    break;
                case 2:
                    calculateQuadraticEquation();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice!!!");
                    ;
            }
        }
    }

}
