package Program.ClassOOP.Tugas4.TugasLingkaran;

public class TesLingkaran {
    public static void main(String[] args) {
        // Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(7.0, "Merah");
        lingkaran1.printInfo();
        System.out.println("Radius: " + lingkaran1.getRadius());

        lingkaran1.setRadius(14.0);
        lingkaran1.printInfo();
        System.out.println("Radius: " + lingkaran1.getRadius());

        System.out.println();

        // Silinder
        Silinder silinder1 = new Silinder(7.0, "Biru", 10.0);
        silinder1.printInfo();
        System.out.println("Tinggi: " + silinder1.getTinggi());

        silinder1.setTinggi(20.0);
        silinder1.printInfo();
        System.out.println("Tinggi: " + silinder1.getTinggi());
    }
}
