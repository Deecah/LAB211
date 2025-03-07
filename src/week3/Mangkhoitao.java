package week3;

import Utilities.Utility;
import java.util.Random;

public class Mangkhoitao {
    private int[] array;

    public Mangkhoitao() {
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