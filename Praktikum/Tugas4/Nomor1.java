package Praktikum.Tugas4;

import java.util.Arrays;
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        try {
            Scanner data = new Scanner(System.in);

            System.out.print("Key = ");
            int key = data.nextInt();

            data.close();

            int[] arr = { 1, 2, 4, 0, 7, 5, 3, 2, 2, 4 };
            int[] newarr = new int[arr.length - (int) Arrays.stream(arr).filter(x -> x == key).count()];

            if (newarr.length == arr.length)
                throw new Error("Error: " + key + " tidak ada di array");

            System.out.print("Array baru = ");
            int newIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != key) {
                    System.out.print(arr[i] + " ");

                    newarr[newIndex] = arr[i];
                    newIndex++;
                }
            }
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }
}
