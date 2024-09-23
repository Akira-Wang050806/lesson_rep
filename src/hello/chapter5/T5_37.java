package hello.chapter5;

import java.util.Scanner;

public class T5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int d = input.nextInt();
        String b = dTob(d);
        System.out.println("对应的二进制值为：" + b);
    }

    public static String dTob(int d) {
        if (d == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (d > 0) {
            int r = d % 2;
            binary.insert(0, r);
            d /= 2;
        }

        return binary.toString();
    }
}
