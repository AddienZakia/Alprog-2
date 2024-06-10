package Program.ClassOOP.Tugas4.TugasSaham;

import java.text.DecimalFormat;

public class Saham {
    String simbol, nama;
    double priorClosingPrice, currentPrice;

    Saham(String simbol, String nama) {
        this.simbol = simbol;
        this.nama = nama;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPriorClosingPrice(double priorClosingPrice) {
        this.priorClosingPrice = priorClosingPrice;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public String getNama() {
        return nama;
    }

    public double getPriorClosingPrice() {
        return priorClosingPrice;
    }

    public String getSimbol() {
        return simbol;
    }

    void getChangePercent() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double perubahan = Math.abs(currentPrice - priorClosingPrice);
        double percent = perubahan * 100;
        String status = currentPrice > priorClosingPrice ? "Menaik" : "Menurun";

        String stringPercent = decimalFormat.format(percent);

        System.out.println("Perubahan pada harga saham " + this.nama + " (" + this.simbol + ") " + status + " sebanyak "
                + stringPercent + "%");
    }
}
