package methods;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter principle amount p : ");
        float p = in.nextFloat();
        System.out.print("enter interest rate r : ");
        float r = in.nextFloat();
        System.out.print("enter time period for loan t in year: ");
        float t = in.nextFloat();
        double s = simpleInterest(p,r,t);
        System.out.println("the simple interest is "+s);
    }
    static double simpleInterest(float a,float b, float c){
        return a*b*c/100.0;
    }
}
