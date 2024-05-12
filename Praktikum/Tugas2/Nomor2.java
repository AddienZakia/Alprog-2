package Praktikum.Tugas2;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int x = 0;

        do {
            System.out.print("x = ");
            x = data.nextInt();

            if (x < 0)
                System.out.println("x tidak boleh negatif");
            else if (x == 0)
                System.out.println("x harus lebih dari 0");
        } while (x <= 0);

        data.close();

        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println("Akar kuadrat dari " + x + " adalah " + i);
                break;
            } else if (i * i > x) {
                System.out.println("Akar kuadrat dari " + x + " mendekati " + (i - 1));
                break;
            }
        }

    }
}
