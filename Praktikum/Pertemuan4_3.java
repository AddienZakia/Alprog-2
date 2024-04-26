package Praktikum;

public class Pertemuan4_3 {
    static boolean isPrime(int bil) {
        boolean def = bil == 2 || bil == 3 || bil == 5 || bil == 7;
        boolean cek = bil == 1 || bil % 2 == 0 || bil % 3 == 0 || bil % 5 == 0 || bil % 7 == 0;

        return def || !cek ? true : false;
    }

    public static void main(String[] args) {
        try {
            int n = 4;

            if (isPrime(n)) {
                throw new IllegalArgumentException(n + " adalah bilangan prima");
            } else {
                throw new Error(n + " bukan bilangan prima");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (Error e) {
            System.err.println(e);
        }
    }
}
