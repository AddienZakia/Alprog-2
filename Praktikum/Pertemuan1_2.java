package Praktikum;

import java.util.Scanner;

// faktorial
public class Pertemuan1_2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int faktor = 0;
        do {
            System.out.print("Masukkan angka faktorial : ");
            faktor = data.nextInt();

            if (faktor > 15) {
                System.out.println("Bilangan terlalu besar");
            } else if (faktor < 0) {
                System.out.println("Bilangan terlalu kecil");
            }
        } while (faktor < 0 || faktor > 15);

        if (faktor == 0) {
            System.out.println(1);
            return;
        }

        int sum = 1;
        for (int i = 1; i <= faktor; i++)
            sum *= i;

        System.out.println(sum);
    }
}
