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
        // Lingkaran b1 = new Lingkaran(5.2);

        // System.out.println("Luas lingaran jari2 = " + b1.getJari2() + " adalah " +
        // b1.luas());

        // b1.setJari2(10);
        // System.out.println("Luas lingaran jari2 = " + b1.getJari2() + " adalah " +
        // b1.keliling());

        // Persegi Panjang class
        // Default Constructor
        // PersegiPanjang pp = new PersegiPanjang();
        // pp.isPersegiPanjang();
        // System.out.println(pp.keliling());
        // System.out.println(pp.luas());

        // define constructor
        // PersegiPanjang pp1 = new PersegiPanjang(3, 4);
        // System.out.println(pp1.keliling());
        // System.out.println(pp1.luas());

        // Employee class
        Employee Dinda = new Employee();
        Dinda.isiData("Dinda", 5_000_000);
        Dinda.display();

        System.out.println(Dinda);

        Manager Daus = new Manager();
        Daus.isiData("Daus", 3_000_000, "Teknik");
        Daus.display();

        System.out.println(Daus);

        Manager Fina = new Manager("Fina", 4_000_000, "HRD");
        Fina.display();

    }
}
