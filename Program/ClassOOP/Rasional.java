package Program.ClassOOP;

public class Rasional {
    private int pemb, peny;

    Rasional() {
        peny = 1;
        pemb = 0;
    }

    Rasional(int pemb, int peny) {
        this.pemb = pemb;
        this.peny = peny;
    }

    public void setPemb(int pemb) {
        this.pemb = pemb;
    }

    public void setPeny(int peny) {
        this.peny = peny;
    }

    public int getPemb() {
        return pemb;
    }

    public int getPeny() {
        return peny;
    }

    void info() {
        System.out.println("Bilangan rasional dengan pembilang = " + pemb);
        System.out.println(" dan penyebut = " + peny);
    }

    double toDesimal() {
        return ((double) pemb / (double) peny);
    }

    void isEqual(Rasional A) {
        if (A.getPemb() * this.getPeny() == A.getPeny() * this.getPemb()) {
            System.out.println("Bilangan A sama dengan B");
        } else {
            System.out.println("Bilangan A tidak sama B");
        }
    }

    Rasional Tambah(Rasional A) {
        Rasional hasil = new Rasional();

        hasil.pemb = this.getPemb() * A.getPeny() + A.getPemb() * this.getPemb();
        hasil.peny = this.getPeny() * A.getPeny();
        return hasil;
    }

    Rasional kaliKonstanta(int c) {
        Rasional hasil = new Rasional();

        hasil.pemb = this.pemb * c;
        hasil.peny = this.peny;
        return hasil;
    }

}
