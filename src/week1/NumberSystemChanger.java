package week1;

import java.util.Scanner;

public class NumberSystemChanger {

    private String input;
    private String output;

    public NumberSystemChanger() {
    }

    void binaryToDecimal() {
        try {
            int num = Integer.parseInt(input, 2);
            System.out.println("Output:" +num);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void binaryToHexadecimal() {
        try {
            int num = Integer.parseInt(input, 2);
            String hex = Integer.toHexString(num);
            System.out.println("Output:" +hex);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void decimalToBinary() {
        try {
            int num = Integer.parseInt(input);
            output = Integer.toBinaryString(num);
            System.out.println("Output:" +output);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void decimalToHexadecimal() {
        try {
            int num = Integer.parseInt(input);
            output = Integer.toHexString(num);
            System.out.println("Output:" +output);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void hexToBinary() {
        try {
            int num = Integer.parseInt(input, 16);
            output = Integer.toBinaryString(num);
            System.out.println("Output:" +output);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void hexToDecimal() {
        try {
            int hex = Integer.parseInt(input, 16);
            System.out.println("Output:" + hex);
        } catch (NumberFormatException n) {
            System.out.println("Invalid number format!!!!");
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("*** Number Changer ***\n"
                    + "1.Binary\n"
                    + "2.Decimal\n"
                    + "3.Hexadecimal\n"
                    + "Choose base number input: "
            );
            int inputType = sc.nextInt();
            sc.nextLine();
            switch (inputType) {
                case 1: {
                    System.out.print(
                            "1.Decimal\n"
                            + "2.Hexadecimal\n"
                            + "Choose base number output: ");
                    int outputType = sc.nextInt();
                    sc.nextLine();
                    switch (outputType) {
                        case 1:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            binaryToDecimal();
                            break;

                        case 2:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            binaryToHexadecimal();
                            break;
                        default:
                            System.out.println("Invalid option!");
                    }
                    break;
                }

                case 2: {
                    System.out.print(
                            "1.Binary\n"
                            + "2.Hexadecimal\n"
                            + "Choose base number output: ");
                    int outputType = sc.nextInt();
                    sc.nextLine();
                    switch (outputType) {
                        case 1:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            decimalToBinary();
                            break;

                        case 2:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            decimalToHexadecimal();
                            break;
                        default:
                            System.out.println("Invalid option!");
                    }
                    break;
                }
                case 3: {
                    System.out.print(
                            "1.Decimal\n"
                            + "2.Binary\n"
                            + "Choose base number output: ");
                    int outputType = sc.nextInt();
                    sc.nextLine();
                    switch (outputType) {
                        case 1:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            hexToDecimal();
                            break;

                        case 2:
                            System.out.print("Enter your number: ");
                            input = sc.nextLine();
                            hexToBinary();
                            break;
                        default:
                            System.out.println("Invalid option!");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid input type!");
            }
        }
    }
}
