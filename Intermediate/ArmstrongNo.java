package Intermediate;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter no ");
        int no = in.nextInt();
        int temp = no;
        while (no != 0) {
            int reminder = no % 10;
            sum = sum + Math.pow(reminder, 3);
            no /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is armstrong no");
        } else {
            System.out.println(temp + " is armstrong not no");
        }
    }
}
