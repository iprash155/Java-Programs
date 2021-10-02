package Intermediate;

import java.util.Scanner;

public class AdditionOftwoNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 nos ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("the sum is "+sum);
    }
}
