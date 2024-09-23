package hello.chapter5;

public class T5_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double e = 1;
            double sum = 0;
            for (int j = 1; j <= i * 10000; j++) {
                double factorial = 1;
                for (int t = 1; t <= j; t++) {
                    factorial *= t;
                }
                sum += 1.0 / factorial;
            }
            e += sum;
            System.out.println(i * 10000 + " " + e);
        }
    }
}
