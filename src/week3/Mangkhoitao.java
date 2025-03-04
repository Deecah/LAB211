package week3;

import java.util.Random;
import java.util.Scanner;

public class Mangkhoitao {
    private int[] array;

    public Mangkhoitao() {
        Scanner sc = new Scanner(System.in);
        int size = Utility.getValidInt("Enter length of array: ", "Please enter a valid number!");
        this.array = new int[size];
    }

    public void addValue() {
        Random random = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void display() {
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}