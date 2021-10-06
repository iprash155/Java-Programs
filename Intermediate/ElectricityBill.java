package Intermediate;

/**
 * the electricity used per day
 */

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the kwh used ");
        float kwh = in.nextFloat();
        System.out.println("enter the cost of kwh ");
        float cost = in.nextFloat();
        System.out.println("enter the days electricity used ");
        int days =  in.nextInt();


            if(kwh>0 && cost>0 && days>0){
                double bill = (kwh*cost)/days;
                System.out.println("the bill is "+bill);
            }
            else {
                System.out.println("invalid input");
            }
    }
}
