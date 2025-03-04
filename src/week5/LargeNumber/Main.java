/*
 * 
 * 
 */

package week5.LargeNumber;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Number n1 = new Number("12345");
        Number n2 = new Number("55555555555");
        
        Number s = n1.addTwoNumber(n2);
        
        System.out.println("sum1 =" +s.getValue());
        
        BigInteger num1 = new BigInteger("12345");
        BigInteger num2 = new BigInteger("55555555555");
        BigInteger sum = num1.add(num2);
        System.out.println("sum2 =" +sum.toString());
    }
}
