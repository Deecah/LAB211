package week3;

public class QuickSort {
    public void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Sorted array using Quick Sort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mangkhoitao m = new Mangkhoitao();
        m.addValue();
        m.display();

        int[] array2 = m.getArray().clone();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array2, 0, array2.length - 1);
        quickSort.displaySortedArray(array2);
    }
}