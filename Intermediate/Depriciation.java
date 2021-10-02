package Intermediate;

import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the depreciation rate in % ");
        float rate = in.nextFloat();
        System.out.println("enter the amount of product ");
        float amount = in.nextFloat();

        double depreciation = amount*rate/100.0f;

        System.out.println("the depreciation is "+depreciation);
    }
}
