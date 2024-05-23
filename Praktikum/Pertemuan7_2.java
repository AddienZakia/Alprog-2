package Praktikum;

public class Pertemuan7_2 {
    public static void main(String[] args) {
        Lingkarans bulat = new Lingkarans(10);
        bulat.info();
    }
}

interface Bentuk2D {
    public double hitungLuas();

    public double hitungKeliling();
}

class Lingkarans implements Bentuk2D {
    private int jari2;

    Lingkarans() {
        this.jari2 = 0;
    }

    Lingkarans(int jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jari2 * jari2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jari2;
    }

    void info() {
        System.out.println("Luas lingkaran : " + this.hitungLuas());
        System.out.println("Keliling lingkaran : " + this.hitungKeliling());
    }
}
