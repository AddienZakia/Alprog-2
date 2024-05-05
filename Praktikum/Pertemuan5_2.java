package Praktikum;

import Praktikum.Mobil;

public class Pertemuan5_2 {
    public static void main(String[] args) {
        Mobil mobilA = new Mobil(300);

        mobilA.setMobil(2, "merah", "McLaren");
        System.out.println(mobilA.getMerk());
        System.out.println(mobilA.getWarna());
        System.out.println(mobilA.getJumlahRoda());
    }
}
