package Program;

import java.util.Scanner;

/**
 * Beberapa situs web memberlakukan aturan tertentu untuk kata
 * sandi. Tuliskan sebuah metode yang memeriksa apakah suatu string adalah kata
 * sandi yang valid. Misalkan aturan dari kata sandi adalah sebagai berikut:
 * • Kata sandi harus terdiri dari sedikitnya delapan karakter.
 * • Kata sandi hanya terdiri dari huruf dan angka.
 * • Kata sandi harus mengandung setidaknya dua digit.
 * Tulis program yang meminta pengguna memasukkan kata sandi dan menampilkan
 * “Kata sandi Valid” jika aturan dipatuhi atau “Kata Sandi Tidak Valid”
 * sebaliknya
 */

public class PeriksaSandi {
    static boolean checkSandi(String sandi) {
        Boolean hasil = true;
        if (sandi.length() < 8)
            hasil = false;

        int digit = 0;
        for (int i = 0; i < sandi.length(); i++) {
            if (Character.isDigit(sandi.charAt(i)))
                digit++;
        }

        return digit >= 2 && hasil;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Berikan string: ");
        String kalimat = data.nextLine();

        Boolean check = checkSandi(kalimat);
        if (check)
            System.out.println("Kata Sandi Valid");
        else
            System.out.println("Kata Sandi Tidak Valid");
    }
}
