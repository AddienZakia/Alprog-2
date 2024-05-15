package Program.ClassOOP;

public class Lingkaran {
    private double R;

    Lingkaran(double jari) {
        R = jari;
    }

    void setJari2(double jari) {
        R = jari;
    }

    double getJari2() {
        return R;
    }

    double keliling() {
        return 2 * Math.PI * R;
    }

    double luas() {
        return Math.PI * Math.pow(R, 2);
    }
}
