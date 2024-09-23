package hello.chapter5;

import java.util.Scanner;

public class T5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the day of the week for January 1st (0-6, where 0 is Sunday): ");
        int dayOfWeek = input.nextInt();

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int month = 1; month <= 12; month++) {
            String monthName = getMonthName(month);
            System.out.println(monthName + " 1, " + year + " is " + daysOfWeek[dayOfWeek]);
            dayOfWeek = (dayOfWeek + getDaysInMonth(month, year)) % 7;
        }
    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            }
            else {
                return 28;
            }
        }
        else {
            return 31;
        }
    }
}
