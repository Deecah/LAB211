
package week2.Maxtrix;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = getValidInt("Enter rows for Matrix 1: ", "Please enter a number");
        int c1 = getValidInt("Enter cols for Matrix 1: ", "Please enter a number");
        Matrix m1 = new Matrix(r1, c1);
        m1.inputMatrix(sc);

        int r2 = getValidInt("Enter rows for Matrix 2: ", "Please enter a number");
        int c2 = getValidInt("Enter cols for Matrix 2: ", "Please enter a number");
        Matrix m2 = new Matrix(r2, c2);
        m2.inputMatrix(sc);
        
        m1.printMatrix();
        m2.printMatrix();

        if (r1 == r2 && c1 == c2) {
            System.out.println("Matrix Addition:");
            m1.add(m2).printMatrix();
        } else {
            System.out.println("Addition is impossible.");
        }
        
        if (r1 == r2 && c1 == c2) {
            System.out.println("Matrix Addition:");
            m1.subtraction(m2).printMatrix();
        } else {
            System.out.println("Subtraction is impossible.");
        }

        if (c1 == r2) {
            System.out.println("Matrix Multiplication:");
            m1.multiply(m2).printMatrix();
        } else {
            System.out.println("Multiplication is impossible.");
        }

    }
 public static int getValidInt(String message, String errormessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                num = Integer.parseInt(sc.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.printf(errormessage);
            }
        }
    }
 
     public static double getValidDouble(String message, String errormessage) {
        double num;
        Scanner sc = new Scanner(System.in);
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
