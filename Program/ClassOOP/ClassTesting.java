package Program.ClassOOP;

public class ClassTesting {
    public static void main(String[] args) {

        // Bentuk class

        // Default constructor
        // Bentuk bentuk = new Bentuk();
        // bentuk.printInfo();

        // System.out.println();

        // Bentuk bentuk1 = new Bentuk("Hijau");
        // System.out.println("Getter : " + bentuk1.getWarna());
        // bentuk1.printInfo();

        // System.out.println();

        // Bentuk bentuk2 = new Bentuk();
        // bentuk2.setWarna("merah");
        // bentuk2.printInfo();

        // Lingkaran Class
        Lingkaran b1 = new Lingkaran(5.2);

        System.out.println("Luas lingaran jari2 = " + b1.getJari2() + " adalah " + b1.luas());

        b1.setJari2(10);
        System.out.println("Luas lingaran jari2 = " + b1.getJari2() + " adalah " + b1.keliling());
    }
}
