package Program.ClassOOP;

public class Bentuk {
    private String warna;

    public Bentuk() {
        warna = "putih";
    }

    public Bentuk(String wn) {
        warna = wn;
    }

    public void setWarna(String wn) {
        warna = wn;
    }

    public String getWarna() {
        return warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna : " + getWarna());
    }

}
