package Program.ClassOOP;

public class PersegiPanjang {
    protected double p, l;

    PersegiPanjang() {
        this.p = 0;
        this.l = 0;
    }

    PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public double getP() {
        return p;
    }

    void isPersegiPanjang() {
        System.out.println("Class tersebut adalah " + (p != l ? "persegi panjang" : "bukan persegi panjang"));
    }

    double keliling() {
        return 2 * (p + l);
    }

    double luas() {
        return p * l;
    }
}
