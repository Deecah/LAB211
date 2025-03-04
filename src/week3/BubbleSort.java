package week3;

public class BubbleSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Sorted array using Bubble Sort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mangkhoitao m = new Mangkhoitao();
        m.addValue();
        m.display();

        int[] array1 = m.getArray().clone();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array1);
        bubbleSort.displaySortedArray(array1);
        
    }
}