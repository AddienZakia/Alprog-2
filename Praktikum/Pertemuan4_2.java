package Praktikum;

public class Pertemuan4_2 {
    static void cobaEksepsi(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil bagi: " + hasil);
            int[] array = { 1, 2, 3, 4, 5 };

            array[10] = hasil;
        } catch (ArithmeticException e) {
            System.out.println("Pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks berlebih");
        }
    }

    public static void main(String[] args) {
        cobaEksepsi(3, 0);
        System.out.println();

        // ArrayIndexOutOfBoundsException error
        cobaEksepsi(21, 3);
    }
}
