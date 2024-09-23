package hello.chapter5;

import java.util.Scanner;

public class T5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number1 = input.nextInt();
        int number = number1;
        int end = 0;

        for (int i = 9; i > 0; i--) {
            int d = number % 10;
            end += d * i;
            number /= 10;
        }

        end = end % 11;

        String isbn;
        if (end != 10) {
            isbn = String.format("%09d%d", number1, end);
            System.out.print("The ISBN-10 number is " + isbn);
        } else {
            isbn = String.format("%09dX", number1);
            System.out.print("The ISBN-10 number is " + isbn);
        }
    }
}
