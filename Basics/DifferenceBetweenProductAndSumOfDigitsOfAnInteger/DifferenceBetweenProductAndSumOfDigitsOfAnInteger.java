package Basics.DifferenceBetweenProductAndSumOfDigitsOfAnInteger;

import java.util.Scanner;

public class DifferenceBetweenProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no ");
        int no =in.nextInt();
        int mul=1;
        int sum = 0;
        //product of digits of no
        while (no!=0) {
            int reminder = no%10;
            mul=mul*reminder;
            sum= sum+reminder;
            no/=10;
        }
        System.out.println("mul "+mul);
        System.out.println("sum "+sum);
       
        //difference b/w product and sum of digit of no
        int difference= mul-sum;
        System.out.println("the difference b/w product and sum of digit of no is "+difference);
    }
}
