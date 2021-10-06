package methods;

import java.util.Scanner;

/**
 * ElectricityBill
 */
public class ElectricityBill {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the kwh used: ");
        float kwh = in.nextFloat();
        System.out.print("enter the cost of kwh: ");
        float cost = in.nextFloat();
        System.out.print("enter the days electricity used: ");
        int days = in.nextInt();
        if (kwh > 0 && cost > 0 && days > 0) {
            float b = bill(kwh, cost, days);
            System.out.print("your bill is : " + b);
        } else {
            System.out.println("invalid input");
        }
    }

    static float bill(float a, float b, int c) {
        return a * b / c;
    }
}