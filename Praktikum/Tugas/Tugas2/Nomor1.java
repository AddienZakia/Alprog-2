package Praktikum.Tugas.Tugas2;

import java.util.Scanner;

public class Nomor1 {
    static boolean isPrime(int bil) {
        boolean def = bil == 2 || bil == 3 || bil == 5 || bil == 7;
        boolean cek = bil == 1 || bil % 2 == 0 || bil % 3 == 0 || bil % 5 == 0 || bil % 7 == 0;

        return def || !cek ? true : false;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int p = 0, x = 1;

        do {
            System.out.print("p = ");
            p = data.nextInt();

            System.out.print("x = ");
            x = data.nextInt();

            if (!isPrime(p))
                System.out.println(p + " bukan bilangan prima");
            else if (x >= p)
                System.out.println(x + " tidak berada di array");
        } while (!isPrime(p) || x >= p);

        data.close();

        int y = 0;
        for (int i = 1; i < p; i++) {
            if ((x * i) % p == 1 % p)
                y = i;
        }

        System.out.println("y = " + y);

    }
}
