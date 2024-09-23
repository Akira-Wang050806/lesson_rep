package hello.chapter5;

import java.util.Scanner;

public class T5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double sum = 0;
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / 10;
        double s = 0;
        double p=0;
        for(int i=0;i<10;i++) {
            p+=Math.pow(numbers[i], 2);
        }
        s=Math.pow((p-Math.pow(sum, 2)/10)/9, 0.5);
        System.out.println("The mean is " + average);
        System.out.println("The standard deviation is " + s);
    }
}
