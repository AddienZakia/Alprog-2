package Program;

import java.util.Scanner;

/**
 * CheckUsia
 */
public class CheckUsia {

    public static void main(String[] args) {

        int age, point = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran array 1: ");
        age = in.nextInt();

        if (age <= 0) {
            System.out.println("Maaf usia tidak bsia bernilai negatif dan bernilai 0");
        } else if (age <= 30) {
            point = 8;
        } else if (age < 40) {
            point = 7;
        } else if (age < 60) {
            point = 6;
        } else {
            point = 4;
        }

        System.out.println("Point : " + point);
    }
}