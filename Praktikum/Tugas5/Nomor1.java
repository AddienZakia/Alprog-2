package Praktikum.Tugas5;

import java.text.DecimalFormat;

public class Nomor1 {
    public static void main(String[] args) {

        // Addien Zakia Hidayat
        // 5002231063
        // a = 0 | 10, b = 6, c = 3
        double a = 10, b = 6, c = 3;
        String garis = "10x + 6y + 3 = 0";
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // titik x,y dengan default constructor
        TitikQu tes1 = new TitikQu();

        System.out.println("titik x,y dengan default constructor");
        tes1.getData();

        System.out.println();

        // Titik (3,7)
        TitikQu tes2 = new TitikQu(3, 7);
        String titik2 = "(" + tes2.x + "," + tes2.y + ")";

        // Formatting
        String jarak2 = decimalFormat.format(tes2.jarak());
        String jarakTitikGaris2 = decimalFormat.format(tes2.jarakTitikKeGaris(a, b, c));

        tes2.getData();
        System.out.println("Jarak dari titik " + titik2 + " dan titik (0,0) adalah " + jarak2);
        System.out.println("Jarak dari titik " + titik2 + " dan ke garis " + garis + "  adalah " + jarakTitikGaris2);

        System.out.println();

        // Titik (10,30.5)
        TitikQu tes3 = new TitikQu(10, 30.5);
        String titik3 = "(" + tes3.x + "," + tes3.y + ")";

        // Formatting
        String jarak3 = decimalFormat.format(tes3.jarak());
        String jarakTitikGaris3 = decimalFormat.format(tes3.jarakTitikKeGaris(a, b, c));

        tes3.getData();
        System.out.println("Jarak dari titik " + titik3 + " dan titik (0,0) adalah " + jarak3);
        System.out.println("Jarak dari titik " + titik3 + " dan ke garis " + garis + "  adalah " + jarakTitikGaris3);
    }
}

class TitikQu {
    double x = 0, y = 0;

    public TitikQu() {
        this.x = 0;
        this.y = 0;
    }

    public TitikQu(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void getData() {
        System.out.println("Nilai x = " + this.x + "\nNilai y = " + this.y);
    }

    double jarak() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double jarakTitikKeGaris(double a, double b, double c) {
        a = a == 0 ? 10 : a;
        b = b == 0 ? 10 : b;
        c = c == 0 ? 10 : c;
        return Math.abs((double) (this.x * a + this.y * b + c) /
                Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
