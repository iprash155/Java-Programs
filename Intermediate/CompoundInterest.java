package Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter the principal amount p ");
        float p = in.nextFloat();
        System.out.println("enter the annual interest rate i ");
        float i = in.nextFloat();
        System.out.println("enter the no of periods n in years ");
        float n = in.nextFloat();
        double compoundInterest= p*(Math.pow((1.0+i),n)-1);
        System.out.println("the compound interest is "+compoundInterest);


    }
}
