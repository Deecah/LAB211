package week3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {  
        int a = getValidInt("Enter length of array:", "Please enter a number!!!");
        Mangkhoitao m = new Mangkhoitao(a);
        m.run();

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
}
