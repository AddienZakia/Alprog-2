package Program;

/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = { 10, 15, 27, 32, 45, 60 };
        int key = 27;

        int bawah = 0;
        int atas = data.length - 1;

        while (true) {
            int tengah = ((atas - bawah) / 2) + bawah;

            if (atas == bawah) {
                System.out.println("data pada urutan : " + (atas + 1));
                break;
            } else if (tengah == bawah && atas - 1 == bawah && data[tengah] != key) {
                System.out.println("Data tidak ditemukan");
                break;
            }

            if (data[tengah] < key)
                bawah = tengah + 1;
            else if (data[tengah] > key)
                atas = tengah - 1;
            else if (data[tengah] == key) {
                System.out.println("data pada urutan : " + (tengah + 1));
                break;
            }

        }

    }
}