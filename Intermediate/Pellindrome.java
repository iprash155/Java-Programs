package Intermediate;

import java.util.Scanner;

public class Pellindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no ");
        int no =in.nextInt();
        int sum = 0;
        int temp=no;
        while (no!=0) {
            int remider=no%10;
            sum=(sum*10)+remider;
            no/=10;           
        }
        if (sum==temp) {
            System.out.println("it is pellindrome no ");
        } else {
            System.out.println("it is not pellindrome no ");
        }
    }
}
