package hello.chapter5;

import java.util.Scanner;

public class T5_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print((j+2)+" ");
            }
            System.out.println();
        }
    }
}
