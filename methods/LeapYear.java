package methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the year : ");
        int year = in.nextInt();
        boolean b = isLeapYear(year);
        if (b) {
            System.out.println("it is leap year");
        } else {
            System.out.println("it is not leap year");
        }
    }

    static boolean isLeapYear(int a) {
        return ((a % 400 == 0)|| (a % 100!= 0 )&& a % 4 == 0);
    }

}
