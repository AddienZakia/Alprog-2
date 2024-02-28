package Program;

import java.util.Scanner;

public class MethodArray {

    static void isiArray(int index, int ukuran, int[] array) {
        Scanner baca = new Scanner(System.in);

        for (int i = 0; i < ukuran; i++) {
            System.out.print("Masukkan array " + index + " untuk data ke " + (i + 1) + " : ");
            array[i] = baca.nextInt();
        }
    }

    static void bacaArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    static int[] jumlah(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Jumlah kedua array tidak sama");
        }

        int[] hasilArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            hasilArray[i] = array1[i] + array2[i];
        }

        return hasilArray;
    }

    static int maxArray(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    public static void main(String[] args) {

        int ukuran1, ukuran2;
        int[] data1, data2, hasilJumlah;

        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan ukuran array 1: ");
        ukuran1 = data.nextInt();
        data1 = new int[ukuran1];

        System.out.print("Masukkan ukuran array 2: ");
        ukuran2 = data.nextInt();
        data2 = new int[ukuran2];

        // isi array
        isiArray(1, ukuran1, data1);
        isiArray(2, ukuran2, data2);

        // menjumlahkan kedua array
        hasilJumlah = jumlah(data1, data2);

        // baca array max
        bacaArray(hasilJumlah);
    }
}
