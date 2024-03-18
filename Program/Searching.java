package Program;

public class Searching {
    public static void main(String[] args) {
        int[] list = { 1, 3, 4, 6, 2, 12, 8, 42 };

        int n = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 10)
                System.out.print(list[i] + " ");
            n++;
        }

        System.out.println("\nFound in : " + n + " times");

    }
}
