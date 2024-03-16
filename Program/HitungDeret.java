package Program;

public class HitungDeret {
    static String deret(double a) {
        double sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }

        return String.format("%.4f", sum * 4);
    }

    public static void main(String[] args) {
        System.out.printf("i%17s\n", "m(i)");
        System.out.println("------------------");
        System.out.printf("1%17s\n", deret(1));
        System.out.printf("101%15s\n", deret(101));
        System.out.printf("201%15s\n", deret(201));
        System.out.printf("301%15s\n", deret(301));
        System.out.printf("401%15s\n", deret(401));
    }
}
