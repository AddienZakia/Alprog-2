package Praktikum;

public class Pertemuan4_1 {
    public static void main(String[] args) {
        int pembilang = 7;
        int penyebut = 0;

        try {
            int hasil = pembilang / penyebut;

            System.out.println("Hasil = " + hasil);
        } catch (Exception e) {
            System.out.println("Kesalahan terdapat pembagian dengan nol");
        } finally {
            System.out.println("ini statement finally");
        }

        System.out.println("Statement setelah trycatch block");
    }
}
