package Praktikum.Tugas3;

import java.util.Scanner;

public class Nomor1 {

    static boolean isPrime(int bil) {
        boolean def = bil == 2 || bil == 3 || bil == 5 || bil == 7;
        boolean cek = bil == 1 || bil % 2 == 0 || bil % 3 == 0 || bil % 5 == 0 || bil % 7 == 0;

        return def || !cek ? true : false;
    }

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

    static void PrintArray(int[] array, String options) {
        for (int i = 0; i < array.length; i++) {
            if (options.equals("ganjil") && array[array.length - 1 - i] % 2 == 1)
                System.out.print(array[array.length - 1 - i] + " ");
            else if (options.equals("genap") && array[i] % 2 == 0)
                System.out.print(array[i] + " ");
            else if (options.equals("prima") && isPrime(array[i]))
                System.out.print(array[i] + " ");
            else if (options.equals("default"))
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("N = ");
            N = data.nextInt();

            if (N <= 0)
                System.out.println("Nilai N harus bernilai bulat positif");
        } while (N <= 0);

        System.out.print("Array = ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = data.nextInt();
        }

        data.close();

        // ngecegah jika user input satu persatu,
        // maka dibiarin selesai input dlu baru melakukan pengecekan
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                System.out.println(
                        "Ada input yang bukan bilangan asli, salah satunya adalah " + arr[i] + " pada indeks ke-" + i);
                return;
            }
        }

        System.out.print("array asli = ");
        PrintArray(arr, "default");

        BubbleSort(arr);
        System.out.print("array terurut = ");
        PrintArray(arr, "default");

        System.out.print("array genap = ");
        PrintArray(arr, "genap");

        System.out.print("array ganjil = ");
        PrintArray(arr, "ganjil");

        System.out.print("array prima = ");
        PrintArray(arr, "prima");
    }
}
