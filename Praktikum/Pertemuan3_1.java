package Praktikum;

public class Pertemuan3_1 {
    static void BubbleSort(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void InsertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        System.out.println();
    }

    static double median(int[] array) {
        double res = 0;
        if (array.length % 2 == 1) {
            res = array[array.length / 2];
        } else if (array.length % 2 == 0) {
            res = (double) (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }

        return res;
    }

    static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] x = { 45, 78, 32, 32, 32, 63, 27, 84, 10 };

        BubbleSort(x);
        // SelectionSort(x);
        // int[] y = InsertionSort(x);

        double med = median(x);

        PrintArray(x);
        System.out.println("Panjang data : " + x.length);
        System.out.println("Median       : " + med);
    }
}
