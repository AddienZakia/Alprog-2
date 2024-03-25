package Program;

import java.util.Scanner;

public class ExceptionError {
    public static void main(String[] args) throws Exception {
        Scanner data = new Scanner(System.in);

        int angka = 0;
        try {
            System.out.print("Masukkan angka : ");
            angka = data.nextInt();
        } catch (Exception e) {
            throw new Exception("input harus berupa angka");
        } finally {
            System.out.println("Final");
        }

    }
}
