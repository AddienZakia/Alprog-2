package Praktikum;

public class Pertemuan6 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("adin", "12345", "Teknik Informatika");
        dosen.View();

        System.out.println();

        Rektor rektor = new Rektor("anjay", "123", "Teknik kedokteran", 2, 3);
        rektor.ViewRektor();

        Dekan dekan = new Dekan("gua", "098", "Sastra mesin", "FK");
        dekan.ViewDekan();

        KaLab kalab = new KaLab("bjir", "1234567890", "Teknik Matematika", "Lab Sistem dan operasi matematika");
        kalab.ViewLab();
    }
}

class Dosen {
    String nama, nik, jurusan;

    Dosen(String nama, String nik, String jurusan) {
        this.nama = nama;
        this.nik = nik;
        this.jurusan = jurusan;
    }

    void View() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIK : " + this.nik);
        System.out.println("Jurusan : " + this.jurusan);
    }
}

class Rektor extends Dosen {
    int th_mulai;
    int jabatan_ke;

    Rektor(String nama, String nik, String jurusan, int thx, int kex) {
        super(nama, nik, jurusan);
        th_mulai = thx;
        jabatan_ke = kex;
    }

    void ViewRektor() {
        this.View();
        System.out.println("Th mulai jabatan : " + th_mulai);
        System.out.println("Jabatan rektor ke : " + jabatan_ke);
        System.out.println();
    }
}

class Dekan extends Dosen {
    String fakultas;

    Dekan(String nama, String nik, String jurusan, String fakultas) {
        super(nama, nik, jurusan);
        this.fakultas = fakultas;
    }

    void ViewDekan() {
        this.View();
        System.out.println("Fakultas : " + this.fakultas);
        System.out.println();
    }
}

class KaLab extends Dosen {
    String lab;

    KaLab(String nama, String nik, String jurusan, String lab) {
        super(nama, nik, jurusan);
        this.lab = lab;
    }

    void ViewLab() {
        this.View();
        System.out.println("Lab : " + this.lab);
        System.out.println();
    }
}