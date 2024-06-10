package Program.ClassOOP.Tugas4.TugasTitik;

public class testTitik {
    public static void main(String[] args) {

        Titik titikA = new Titik();
        titikA.infoKuadran();

        System.out.println();

        Titik titikB = new Titik(3, 4);
        titikB.infoKuadran();

        System.out.println();

        Titik titikC = new Titik();
        titikC.geser(new Titik(1, -1));
        titikC.infoKuadran();

        System.out.println();

        Titik titikD = new Titik(6, 8);
        System.out.println("Jarak antara titikB dan titikD: " + titikB.jarak(titikD));

        System.out.println();

        Titik titikE = new Titik(9, 12);
        System.out.println("Titik B, titik D, dan titik E segaris: " + titikB.segaris(titikD, titikE));

        System.out.println();

        Titik titikF = new Titik(2, 2);
        titikF.geser(titikB);
        titikF.infoKuadran();

        System.out.println();

        Titik titikG = new Titik(3, 6);
        Titik titikH = new Titik(6, 12);
        System.out.println("Titik G, titik H, dan Titik (9,18) segaris: " + titikG.segaris(titikH, new Titik(9, 18)));
    }
}
