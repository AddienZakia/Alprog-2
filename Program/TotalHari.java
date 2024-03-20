package Program;

import java.util.Scanner;

/**
 * Tulis metode yang mengembalikan jumlah hari dalam setahun menggunakan header
 * berikut:
 * int statis publik numberOfDaysInAYear(int tahun)
 * Tulislah program pengujian yang menampilkan jumlah hari dalam setahun dari
 * tahun 2010 hingga 2025.
 */

public class TotalHari {
    static int total_hari(int tahun1, int tahun2) {
        int sum = 0;
        for (int i = tahun1; i <= tahun2; i++) {
            if (i % 4 == 0)
                sum += 366;
            else
                sum += 365;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int tahun1, tahun2;
        System.out.print("masukkan tahun pertama: ");
        tahun1 = data.nextInt();

        System.out.print("masukkan tahun pertama: ");
        tahun2 = data.nextInt();

        data.close();

        int total = total_hari(tahun1, tahun2);
        System.out.println("Total hari: " + total + " hari");
    }
}
