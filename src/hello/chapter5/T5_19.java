package hello.chapter5;

import java.util.Scanner;

public class T5_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print("    ");
            }
            System.out.print(1);
//            for (int j = 0; j < i; j++) {
//                System.out.print((int) (Math.pow(2,j))+" ");
//            }
//            for (int j = 0; j < i-1; j++) {
//                System.out.print((int) (Math.pow(2,(i-2-j)))+" ");
//            }
            for (int j = 0; j < i - 1; j++) {
                System.out.printf("%4d",(int)(Math.pow(2,j+1)));
            }
            for (int j = i-2; j >=0; j--) {
                System.out.printf("%4d",(int)(Math.pow(2,j)));
            }
            System.out.println();
        }
    }
}

