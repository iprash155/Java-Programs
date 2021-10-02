package Intermediate.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no ");
        int no = in.nextInt();
        int mul=1 ;
        for (int i= 1; i<=no; i++) {
            mul=mul*i;
        }
        System.out.println("the factorial of the no is "+mul);
    }
}
