package Praktikum;

public class Pertemuan7 {
    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran("merah", 10);
        bulat.info();
    }
}

abstract class bentuk2D {
    String warna;

    bentuk2D() {
        this.warna = "Transparan";
    }

    bentuk2D(String warna) {
        this.warna = warna;
    }

    abstract double hitungLuas();

    abstract double hitungKeliling();
}

class Lingkaran extends bentuk2D {

    public int jari2;

    Lingkaran() {
        super();
        this.jari2 = 0;
    }

    Lingkaran(String warna, int jari2) {
        super(warna);
        this.jari2 = jari2;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jari2 * jari2;
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * jari2;
    }

    void info() {
        System.out.println("Luas lingkaran : " + this.hitungLuas());
        System.out.println("Keliling lingkaran : " + this.hitungKeliling());
    }
}