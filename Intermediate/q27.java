package Intermediate;

import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the nos ");
        int sumOfEvenNo = 0;
        int sumOfOddNo = 0;
        int sumOfNegativeNo = 0;

        while (true) {
            int no = in.nextInt();
            if (no == 0) {
                break;
            } else {
                if (no % 2 == 0 && no > 0) {
                    sumOfEvenNo = sumOfEvenNo + no;
                } else if (no < 0) {
                    sumOfNegativeNo = sumOfNegativeNo + no;
                } else if (no % 2 != 0 && no > 0) {
                    sumOfOddNo = sumOfOddNo + no;
                }
            }
        }
        System.out.println("sum of all even no is " + sumOfEvenNo);
        System.out.println("sum of all odd no is " + sumOfOddNo);
        System.out.println("sum of all negative no is " + sumOfNegativeNo);
    }
}
