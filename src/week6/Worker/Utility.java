package week6.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utility {

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

    public static String getValidString(String regex, String message, String errormessage) {
        String s;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            s = sc.nextLine();
            if (s.matches(regex)) {
                return s;
            } else {
                System.out.println(errormessage);
            }
        }
    }

    public static LocalDate getValidDate(String message, String errormessage) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print(message);
            try {
                return LocalDate.parse(sc.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println(errormessage);
            }
        }
    }
    
    public static int getPositiveInt(String message, String errormessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                num = Integer.parseInt(sc.nextLine());
                if(num>=0){
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.printf(errormessage);
            }
        }
    }
}
