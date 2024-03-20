package Program;

public class InsertionSort {
    public static void main(String[] args) {
        int[] x = { 45, 78, 32, 91, 15, 63, 27, 50, 84, 10 };

        for (int i = 0; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j] < x[j - 1]) {
                    int temp = x[j];
                    x[j] = x[j - 1];
                    x[j - 1] = temp;
                }
            }
        }

    }
}
