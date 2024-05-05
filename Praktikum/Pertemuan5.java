package Praktikum;

public class Pertemuan5 {
    public static void main(String[] args) {
        Mobil mobilA = new Mobil(200);

        mobilA.setMobil(4, "Hitam", "McLaren");
        System.out.println(mobilA.getMerk());
        System.out.println(mobilA.getWarna());
        System.out.println(mobilA.getJumlahRoda());
    }
}

class Mobil {
    String warna;
    int jumlah_roda;
    String merk;

    Mobil(int jumlah) {
        this.jumlah_roda = jumlah;
    }

    public void setMobil(int jumlah_roda, String warna, String merk) {
        // this.jumlah_roda = jumlah_roda;
        this.merk = merk;
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getMerk() {
        return this.merk;
    }

    public int getJumlahRoda() {
        return this.jumlah_roda;
    }

}
