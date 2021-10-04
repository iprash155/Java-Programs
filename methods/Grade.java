package methods;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no of subjects : ");
        int noOfSub = in.nextInt();
        System.out.println("enter all marks : ");
        int total = 0;
        for (int i = 1; i <= noOfSub; i++) {
            int marks = in.nextInt();
            total = total + marks;
        }
        System.out.println("total is :" + total);
        double percentage = total / (noOfSub * 100.0) * 100.0;
        System.out.println("percentage is :" + percentage);
        String grade = grade(percentage);
        System.out.println("your grade is : " + grade);
    }

    static String grade(double percentage) {

        if (percentage >= 91 && percentage <= 100) {
            return "AA";
        }
        if (percentage > 80) {
            return "AB";
        }
        if (percentage > 70) {
            return "BB";
        }
        if (percentage > 60) {
            return "BC";
        }
        if (percentage > 50) {
            return "CD";
        }
        if (percentage > 40) {
            return "DD";
        }
        return "fail";
    }
}
