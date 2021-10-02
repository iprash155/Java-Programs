package Intermediate;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter investment amount i ");
        float i = in.nextFloat();
        System.out.println("enter interest rate r ");
        float r = in.nextFloat();
        System.out.println("enter no of years ");
        float t = in.nextFloat();

        double futureValue=i*(1+(r*t));

        System.out.println("the futurevalue is "+futureValue);
    }
    }

