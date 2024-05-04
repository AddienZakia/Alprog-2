package Praktikum.Tugas4;

import java.util.Arrays;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Key = ");
        int key = data.nextInt();

        data.close();

        int[] arr = { 1, 2, 4, 0, 7, 5, 3, 2, 2, 4 };
        int[] arr2 = new int[arr.length - (int) Arrays.stream(arr).filter(x -> x == key).count()];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr2[j] = arr[i];
                j++;
            }
        }
    }
}
