package Program.ClassOOP.Tugas4.TugasLingkaran;

import java.text.DecimalFormat;

public class Lingkaran {
    private double radius;
    protected String warna;

    Lingkaran(double radius, String warna) {
        this.radius = radius;
        this.warna = warna;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double hitungLuas() {
        return Math.PI * this.radius * this.radius;
    }

    public void printInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Lingkaran " + this.warna + ", luas = " + decimalFormat.format(this.hitungLuas()));
    }
}

class Silinder extends Lingkaran {
    private double tinggi;

    Silinder(double radius, String warna, double tinggi) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggi;
    }

    public void printInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Silinder warna " + super.warna + ", volume = " + decimalFormat.format(this.hitungVolume()));
    }
}
