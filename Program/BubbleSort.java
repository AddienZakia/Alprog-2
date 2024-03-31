package Program;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = { 45, 78, 32, 91, 15, 63, 27, 50, 84, 10 };

        for (int i = 0; i <= x.length; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        // for (int w = 0; w < x.length; w++)
        // System.out.print(x[w] + " ");
        // System.out.println();
    }
}
