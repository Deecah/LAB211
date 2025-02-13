package week3;

import java.util.Random;

public class Mangkhoitao {

    private int[] array;

    public Mangkhoitao(int a) {
        this.array = new int[a];
    }

    void addValue(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(10);
        }
    }

    void display() {
        System.out.print("array: \n");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    void run() {
        addValue(array);
        display();
        duyet();
        System.out.print("\nsorted ");
        display();
    }

    void duyet() {

        for (int j = 0; j < array.length - 1; j++) {
            boolean check = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
        }

    }

}
