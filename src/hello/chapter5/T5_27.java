package hello.chapter5;

public class T5_27 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal leap years between 101 and 2100: " + count);
    }
}
