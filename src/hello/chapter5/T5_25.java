package hello.chapter5;

import java.util.Scanner;

public class T5_25 {
    public static void main(String[] args) {
        System.out.print("输入i的值：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double pi=pai(i);
        System.out.print(pi);
    }

    static double pai(int n){
        double pi=0;
        for (int i = 1; i <=n; i++) {
            pi=pi+4.0*(Math.pow(-1,i+1)/(2*i-1));
        }
        return pi;
    }
}
