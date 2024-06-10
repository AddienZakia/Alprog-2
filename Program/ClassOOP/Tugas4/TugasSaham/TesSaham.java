package Program.ClassOOP.Tugas4.TugasSaham;

public class TesSaham {
    public static void main(String[] args) {
        Saham saham = new Saham("HKN", "Harta ku");

        saham.setPriorClosingPrice(34.5);
        saham.setCurrentPrice(34.35);
        saham.getChangePercent();
    }
}
