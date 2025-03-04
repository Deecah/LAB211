
package week4.StudentAndTeacher;

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
    public static String getValidString(String regex ,String message, String errormessage) {
        String s;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(message);
                s = sc.nextLine();
            if(s.matches(regex)){
                 return s;
            }else{
                System.out.println(errormessage);
            }       
        }
    }
}
