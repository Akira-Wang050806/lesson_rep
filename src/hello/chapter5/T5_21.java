package hello.chapter5;

import java.util.Scanner;

public class T5_21 {
    public static void main(String[] args) {
        System.out.print("Loan Amount:");
        Scanner scanner = new Scanner(System.in);
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years:");
        int years = scanner.nextInt();
        String str1="Interest Rate";
        String str2="Monthly Payment";
        String str3="Total Payment";
        System.out.printf("%-20s%-20s%-20s%n", str1,str2,str3);
        double rateNumber=0.05;
        String rate="";
        double percent=0;
        double monthlyPayment=0;
        double totallyPayment=0;
        for (int i = 0; i < 24; i++) {
            rateNumber=0.05+0.00125*i;
            percent=5+i*0.125;
            monthlyPayment=loanAmount*rateNumber/(1-1/Math.pow(1+rateNumber,years*12));
            totallyPayment=monthlyPayment*years*12;
            System.out.printf("%-20s",String.format("%.3f%%", percent));
            System.out.printf("%-20s",String.format("%.2f", monthlyPayment));
            System.out.printf("%.2f%n", totallyPayment);
        }
    }
}
