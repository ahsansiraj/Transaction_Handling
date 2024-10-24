package dsa_questions.src.ISCPrograms;

import java.util.Scanner;

public class DateCalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DateCalculator ob = new DateCalculator();

        int ar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter a date in 'dd/mm' form:");
        String date1 = sc.nextLine();
        String d = date1.substring(0, 2);
        String m = date1.substring(3, 5);

        System.out.println("Enter 2nd date in 'dd/mm' form:");
        String date2 = sc.nextLine();
        String d2 = date2.substring(0, 2);
        String m2 = date2.substring(3, 5);

        int days1 = ob.calculateDays(ar, d, m);
        int days2 = ob.calculateDays(ar, d2, m2);
        int daysElapsed = Math.abs(days2 - days1);

        System.out.println("Days elapsed: " + daysElapsed);
        sc.close();
    }

    public int calculateDays(int ar[], String d, String m) {
        int sum = Integer.parseInt(d);
        int mn = Integer.parseInt(m);

        for (int i = 0; i < mn - 1; i++) {
            sum += ar[i];
        }
        return sum;
    }
}

