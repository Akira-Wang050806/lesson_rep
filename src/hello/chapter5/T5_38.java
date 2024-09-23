package hello.chapter5;

import java.util.Scanner;

public class T5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int d = input.nextInt();
        String o = dToo(d);
        System.out.println("对应的八进制值为：" + o);
    }

    public static String dToo(int d) {
        if (d == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();

        while (d > 0) {
            int r = d % 8;
            octal.insert(0, r);
            d /= 8;
        }

        return octal.toString();
    }
}
