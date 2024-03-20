package Program;

public class SelectionSort {
    public static void main(String[] args) {
        int[] x = { 45, 78, 32, 91, 15, 63, 27, 50, 84, 10 };

        for (int i = 0; i < x.length; i++) {

            int min = i;

            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[min])
                    min = j;
            }

            int temp = x[min];
            x[min] = x[i];
            x[i] = temp;
        }

        for (int w = 0; w < x.length; w++)
            System.out.print(x[w] + " ");
        System.out.println();
    }
}
