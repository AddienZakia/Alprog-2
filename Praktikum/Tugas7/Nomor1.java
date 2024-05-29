package Praktikum.Tugas7;

public class Nomor1 {
    public static void main(String[] args) {

        String[] testing = { "alpro 2", "namaku", "YEYY!!!!", "4ku C1n74 kAmU" };

        for (String tes : testing) {
            Chiper chip = new Chiper(tes);
            System.out.println("Enkripsi Caesar : " + chip.enkripsi());
            System.out.println("Dekripsi Caesar : " + chip.dekripsi());

            Reverse rev = new Reverse(tes);
            System.out.println("Enkripsi Reverse : " + rev.enkripsi());
            System.out.println("Dekripsi Reverse : " + rev.dekripsi());

            System.out.println();
        }
    }
}

interface Mengenkripsi {
    String enkripsi();

    String dekripsi();

}

class Chiper implements Mengenkripsi {
    String kalimat;

    Chiper(String kalimat) {
        this.kalimat = kalimat;
    }

    @Override
    public String enkripsi() {
        String res = "";
        for (int i = 0; i < this.kalimat.length(); i++) {
            int x = (int) this.kalimat.charAt(i);

            res += String.valueOf((char) (x + 3));
        }

        return res;
    }

    @Override
    public String dekripsi() {
        String res = "";
        String enkripsi = this.enkripsi();

        for (int i = 0; i < enkripsi.length(); i++) {
            int x = (int) enkripsi.charAt(i);

            res += String.valueOf((char) (x - 3));
        }

        return res;
    }

}

class Reverse implements Mengenkripsi {
    String kalimat;

    Reverse(String kalimat) {
        this.kalimat = kalimat;
    }

    @Override
    public String enkripsi() {
        String res = "";

        for (int i = this.kalimat.length() - 1; i >= 0; i--) {
            res += this.kalimat.charAt(i);
        }

        return res;
    }

    @Override
    public String dekripsi() {
        // dekripsi reverse = 2x enkripsi
        String res = "";
        String enkripsi = this.enkripsi();

        for (int i = enkripsi.length() - 1; i >= 0; i--) {
            res += enkripsi.charAt(i);
        }

        return res;
    }

}
