package Praktikum.Tugas.Tugas1;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double x = 0;

        do {
            System.out.print("Beri nilai P : ");
            x = data.nextDouble();

            if (x <= 0) {
                System.out.println("Angka untuk nilai P harus lebih dari 0");
            }
        } while (x <= 0);

        data.close();

        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            sum += i / (2 * i + 1);

            if (sum > x) {
                System.out.println("Nilai n terkecil : " + i + ", sum : " + String.format("%.3f", sum));
                return;
            }
        }

        System.out.println("Nilai p terlalu besar");
    }
}
