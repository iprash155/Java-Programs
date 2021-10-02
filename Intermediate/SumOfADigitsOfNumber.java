package Intermediate;

import java.util.Scanner;

public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no ");
        int no = in.nextInt();
        int sum=0;
        while (no!=0) {
            int rem = no%10;
            sum=sum+rem;
            no/=10;
        }
        System.out.println("the sum of the digits of a no is "+sum);
    }
}
