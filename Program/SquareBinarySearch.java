package Program;

import java.util.Scanner;

public class SquareBinarySearch {
    static void binSearch(int[] arr, int key) {
        if (key == 0) {
            System.out.println("sqrt(0) = 0");
            return;
        }

        int awal = 0;
        int akhir = arr.length - 1;

        while (true) {
            int tengah = awal + (akhir - awal) / 2;

            if (awal == tengah && Math.pow(arr[tengah], 2) > key) {
                System.out.println("sqrt(" + key + ") = " + (tengah));
                break;
            }

            if (arr[tengah] * arr[tengah] == key) {
                System.out.println("sqrt(" + key + ") = " + arr[tengah]);
                break;
            } else if (arr[tengah] * arr[tengah] > key) {
                akhir = tengah - 1;
            } else if (arr[tengah] * arr[tengah] < key) {
                awal = tengah + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("number = ");
        int num = data.nextInt();

        data.close();

        int[] arr = new int[num];
        for (int i = 1; i <= num; i++)
            arr[i - 1] = i;

        binSearch(arr, num);
    }
}
