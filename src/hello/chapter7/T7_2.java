package hello.chapter7;

import java.util.Scanner;

public class T7_2 {
    public static void main(String[] args) {
        //初始化数组
        int[] ints = new int[10];
        //读取十个整数放到数组中
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            ints[i] = scanner.nextInt();
        }
        //倒序输出
        for (int i = 0; i < 10; i++) {
            System.out.println(ints[10-i-1]);
        }
    }
}
