package methods;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the depreciation rate in %: ");
        float d = in.nextFloat();
        System.out.print("enter the amount of product : ");
        float amount = in.nextFloat();
        float dep = depreciation(d,amount);
        System.out.println("the depreciation of the product is : "+dep);
    }
    static float depreciation(float d , float amount){
        return amount*d/100;
    }
}
