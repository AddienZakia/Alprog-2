package Program.ClassOOP.Tugas4.TugasTitik;

public class Titik {
    private int x, y;

    Titik() {
        this.x = 0;
        this.y = 0;
    }

    Titik(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    Titik geser(Titik p) {
        this.x = p.x;
        this.y = p.y;

        return this;
    }

    void infoKuadran() {
        String kuadran = "";

        if (this.x == 0 && this.y == 0) {
            kuadran = "Titik Asal";
        } else if (this.x > 0) {
            if (this.y > 0)
                kuadran = "Kuadran 1";
            else
                kuadran = "Kuadran 4";
        } else if (this.x < 0) {
            if (this.y > 0)
                kuadran = "Kuadran 2";
            else
                kuadran = "Kuadran 3";
        }

        System.out.println("Titik (" + this.x + "," + this.y + ") berada di " + kuadran);
    }

    double jarak(Titik p1) {
        return Math.sqrt(Math.pow(p1.x - this.x, 2) + Math.pow(p1.y - this.y, 2));
    }

    boolean segaris(Titik titik1, Titik titik2) {
        int area = this.x * (titik1.y - titik2.y) + titik1.x * (titik2.y - this.y) + titik2.x * (this.y - titik1.y);
        return area == 0;
    }

}
