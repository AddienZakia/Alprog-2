package Praktikum;

// import java.util.Scanner;

public class Pertemuan2_1 {
    static int linearSearch(String kata, char key) {
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == key) {
                return i + 1;
            }
        }

        return 0;
    }

    static int binarySearch(int[] data, int key) {
        int bawah = 0;
        int atas = data.length - 1;

        while (true) {
            int tengah = ((atas - bawah) / 2) + bawah;
            // System.out.println(bawah + " " + tengah + " " + atas);

            if (atas == bawah) {
                return atas + 1;
            } else if (tengah == bawah && atas - 1 == bawah && data[tengah] != key) {
                return -1;
            }

            if (data[tengah] < key)
                bawah = tengah + 1;
            else if (data[tengah] > key)
                atas = tengah - 1;
            else if (data[tengah] == key) {
                return tengah + 1;
            }

        }
    }

    public static void main(String[] args) {
        // linear search
        // Scanner data = new Scanner(System.in);

        // System.out.print("Masukkan kata : ");
        // String kata = data.nextLine().toLowerCase();

        // System.out.print("Masukkan key : ");
        // char key = data.nextLine().toLowerCase().charAt(0);

        // data.close();

        // int pos = linearSearch(kata, key);
        // if (pos == 0)
        // System.out.println("Tidak ditemukan");
        // else
        // System.out.println("Key berada pada index ke : " + pos);

        // binary search
        int[] data = { 10, 15, 27, 32, 45, 60 };
        int key = 27;

        int pos = binarySearch(data, key);
        if (pos == -1)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println("Data pada urutan : " + pos);
    }
}
