package week2.BMItest;

import java.util.Scanner;

public class BMI {

    private String input;

    public BMI() {
    }
    Scanner sc = new Scanner(System.in);

    void calculator() {
        System.out.println("----- Normal Calculator -----");
        System.out.print("Enter number: ");
        double temp;
        char op;
        while (true) {
            try {
                temp = sc.nextDouble();
                System.out.println("Current value:" + temp);
                break;
            } catch (NumberFormatException n) {
                System.out.println("Invalid number format!!!!");
            }
        }

        double b;
        while (true) {

            while (true) {
                System.out.print("Enter an operator( + | - | * | / | ^ ):");
                op = sc.next().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '^' || op == '=') {
                    break;
                } else {
                    System.out.printf("Please enter an operator!!!");
                }
            }

            if (op == '=') {
                System.out.println("Result:" + temp);
                break;
            }

            while (true) {
                try {
                    System.out.print("Enter next number:");
                    b = sc.nextDouble();
                    break;
                } catch (NumberFormatException n) {
                    System.out.println("Invalid number format!!!!");
                }
            }
            switch (op) {
                case '+': {
                    temp = temp + b;
                    System.out.println("Current value :" + temp);
                    break;
                }
                case '-': {
                    temp = temp - b;
                    System.out.println("Current value :" + temp);
                    break;
                }
                case '*': {
                    temp = temp * b;
                    System.out.println("Current value :" + temp);
                    break;
                }
                case '/': {
                    temp = temp / b;
                    System.out.println("Current value :" + temp);
                    break;
                }
                case '^': {
                    temp = Math.pow(temp, b);
                    System.out.println("Current value :" + temp);
                    break;
                }
            }
        }

    }

    void calBMI() {

        while (true) {
            double w = 0;
            double h = 0;
            System.out.println("Calculating BMI !!!!");
            while (true) {
                try {
                    System.out.print("Enter your weight (kg): ");
                    w = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException s) {
                    System.out.printf("You must enter appropriate number!!!\n");
                }
            }

            while (true) {
                try {
                    System.out.print("Enter your height(m):");
                    h = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException s) {
                    System.out.printf("You must enter appropriate number!!!\n");
                }
            }

            double bmiindex = w / (h * h);
            System.out.println("Your BMI index:" + bmiindex);
            if (bmiindex < 19) {
                System.out.println("Status: Under-standard");
            }
            if (19 <= bmiindex && bmiindex < 25) {
                System.out.println("Status: Standard");
            }
            if (25 <= bmiindex && bmiindex < 30) {
                System.out.println("Status: Overweight");
            }
            if (30 <= bmiindex && bmiindex < 40) {
                System.out.println("Status: Fat - should lose weight");
            }
            if (bmiindex >= 40) {
                System.out.println("Status: Very fat - should lose weight immediately");
            }
            break;
        }
    }

    void run() {
        while (true) {

            System.out.print("========= Calculator Program =========\n"
                    + "1. Normal Calculator\n"
                    + "2. BMI Calculator\n"
                    + "3. Exit\n"
                    + "Please choice one option:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    calculator();
                    break;
                case 2:
                    calBMI();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter number to choose!!!");
            }
        }
    }
}
