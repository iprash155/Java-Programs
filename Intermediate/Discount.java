package Intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount of product ");
        float amount = in.nextFloat();
        System.out.println("enter the discount in % ");
        float discount = in.nextFloat();
        float total = amount-(amount*discount/100);
        System.out.println("the total amount is "+total);
    }
}
