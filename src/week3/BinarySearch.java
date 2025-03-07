package week3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Mangkhoitao mang = new Mangkhoitao();
        mang.addValue();
        Arrays.sort(mang.getArray());
        mang.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int target = sc.nextInt();

        int result = binarySearch(mang.getArray(), target);
        if (result == -1) {
            System.out.println("Value not found in array.");
        } else {
            System.out.println("Value found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}
