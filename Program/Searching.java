package Program;

public class Searching {
    public static void main(String[] args) {
        int[] list = { 1, 3, 4, 6, 2, 12, 8, 42 };
        int dicari = 6;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == dicari) {
                System.out.println(list[i] + " index ke: " + i);
                // break;
            }
        }

    }
}
