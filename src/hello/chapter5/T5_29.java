package hello.chapter5;

import java.util.Scanner;

public class T5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            String monthName = getMonthName(month);
            System.out.println("\n" + centerString(monthName + " " + year, 20));
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }
            int daysInMonth = getDaysInMonth(year, month);
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day);
                if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                    System.out.println();
                }
            }
            firstDay = (firstDay + daysInMonth) % 7;
        }

    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return months[month - 1];
    }

    public static int getDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year %100 !=0)||year%400==0;
    }

    public static String centerString(String s, int length){
        if(s.length() >= length){
            return s;
        }else{
            int leftSpace = (length - s.length()) /2;
            int rightSpace = length - s.length() - leftSpace;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<leftSpace;i++){
                sb.append(" ");
            }
            sb.append(s);
            for(int i=0;i<rightSpace;i++){
                sb.append(" ");
            }
            return sb.toString();
        }
    }
}
