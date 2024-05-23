package Praktikum.Tugas6;

public class Nomor1 {
    public static void main(String[] args) {
        // Testing class Orang
        Orang orang = new Orang("addien", "keputih", "123456", "addien@gmail.com");
        orang.setNama("zakia");
        orang.setAlamat("asrama");
        orang.setNoTelp("7890");
        orang.setEmail("zakia@gmail.com");
        System.out.println("Orang Details:");
        orang.display();

        // Testing class Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("budi", "jakarta", "0987", "budi@gmail.com", "2025");
        mahasiswa.setNama("yanto");
        mahasiswa.setAlamat("surabaya");
        mahasiswa.setNoTelp("012345");
        mahasiswa.setEmail("budiyanto@gmail.com");
        mahasiswa.setTahunAngkatan("2021");
        System.out.println("\nMahasiswa Details:");
        mahasiswa.display();

        // Testing class Pegawai
        Pegawai pegawai = new Pegawai("es te ye", "timnas", "45678", "sty@gmail.com", "1000", 999);
        pegawai.setNama("Shin tae yong");
        pegawai.setAlamat("indo");
        pegawai.setNoTelp("7890");
        pegawai.setEmail("esteye@gmail.com");
        pegawai.setDataGaji("10000");
        pegawai.setJamKerja(999999);
        System.out.println("\nPegawai Details:");
        pegawai.display();

        // Testing class Dosen
        Dosen dosen = new Dosen("bung towel", "korea utara", "00000", "towel@gmail.com", "-200", 9999, "mafia");
        dosen.setNama("bung handuk");
        dosen.setAlamat("israel");
        dosen.setNoTelp("11111");
        dosen.setEmail("towhell@gmail.com");
        dosen.setDataGaji("-9999");
        dosen.setJamKerja(90909);
        dosen.setGelar("mafia");
        System.out.println("\nDosen Details:");
        dosen.display();

        // Testing class Tendik
        Tendik tendik = new Tendik("King indo", "Pildun 2026", "+628***", "king-indo@gmail.com", "9999", 1,
                "Calon Juara Pildun 2026");
        tendik.setNama("King Indo");
        tendik.setAlamat("Pildun 2026");
        tendik.setNoTelp("+628**");
        tendik.setEmail("kingindo@gmail.com");
        tendik.setDataGaji("9999");
        tendik.setJamKerja(1);
        tendik.setJabatan("Calon Juara Pildun 2026");
        System.out.println("\nTendik Details:");
        tendik.display();
    }
}

class Orang {
    String nama, alamat, noTelp, email;

    Orang(String nama, String alamat, String noTelp, String email) {
        this.alamat = alamat;
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    void display() {
        System.out.println("Nama      : " + this.nama);
        System.out.println("Email     : " + this.email);
        System.out.println("Alamat    : " + this.alamat);
        System.out.println("No Telp   : " + this.noTelp);
    }
}

class Mahasiswa extends Orang {
    String tahunAngkatan;

    Mahasiswa(String nama, String alamat, String noTelp, String email, String tahunAngkatan) {
        super(nama, email, alamat, noTelp);
        this.tahunAngkatan = tahunAngkatan;
    }

    public void setTahunAngkatan(String tahunAngkatan) {
        this.tahunAngkatan = tahunAngkatan;
    }

    public String getTahunAngkatan() {
        return tahunAngkatan;
    }

    void display() {
        super.display();
        System.out.println("Tahun Akt : " + this.tahunAngkatan);
    }

}

class Pegawai extends Orang {
    String dataGaji;
    int jamKerja;

    Pegawai(String nama, String alamat, String noTelp, String email, String dataGaji, int jamKerja) {
        super(nama, email, alamat, noTelp);
        this.dataGaji = dataGaji;
        this.jamKerja = jamKerja;
    }

    public void setDataGaji(String dataGaji) {
        this.dataGaji = dataGaji;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getDataGaji() {
        return dataGaji;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    void display() {
        super.display();
        System.out.println("Gaji      : " + this.dataGaji);
        System.out.println("Jam Kerja : " + this.jamKerja);
    }
}

class Dosen extends Pegawai {
    String gelar;

    Dosen(String nama, String alamat, String noTelp, String email, String dataGaji, int jamKerja, String gelar) {
        super(nama, alamat, noTelp, email, dataGaji, jamKerja);
        this.gelar = gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    void display() {
        super.display();
        System.out.println("Gelar     : " + this.gelar);
    }
}

class Tendik extends Pegawai {
    String jabatan;

    Tendik(String nama, String alamat, String noTelp, String email, String dataGaji, int jamKerja, String jabatan) {
        super(nama, alamat, noTelp, email, dataGaji, jamKerja);
        this.jabatan = jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    void display() {
        super.display();
        System.out.println("Jabatan   : " + this.jabatan);
    }
}