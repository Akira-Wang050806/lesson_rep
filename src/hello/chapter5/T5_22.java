package hello.chapter5;

import java.util.Scanner;

public class T5_22 {
    public static void main(String[] args) {
        System.out.print("Loan Amount:");
        Scanner scanner = new Scanner(System.in);
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years:");
        int years = scanner.nextInt();
        System.out.print("Annual Interest Rate:");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest=(annualInterest/100)/12;

        //计算月支付额和总支付额
        double monthlyPayment=loanAmount*monthlyInterest/(1-1/Math.pow(1+monthlyInterest,years*12));
        double totalPayment=monthlyPayment*12*years;
        //输出支付额
        System.out.println("monthly payment:"+monthlyPayment);
        System.out.println("total payment:"+totalPayment);
        System.out.println();
        
        System.out.printf("%-20s","Payment#");
        System.out.printf("%-20s","Interest");
        System.out.printf("%-20s","Principal");
        System.out.printf("%-20s","Balance");
        System.out.println();

        double interest=0;
        double principal=0;
        for (int i = 0; i < years * 12; i++) {
            interest=monthlyInterest*loanAmount;
            principal=monthlyPayment-interest;
            loanAmount=loanAmount-principal;
            System.out.printf("%-20d%-20.2f%-20.2f%-20.2f",i+1,interest,principal,loanAmount);
            System.out.println();
        }
    }
}
