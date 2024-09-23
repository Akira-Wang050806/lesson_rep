package hello.chapter5;

public class T5_33 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 4) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
