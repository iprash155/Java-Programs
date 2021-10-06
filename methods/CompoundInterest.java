package methods;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principal amount p : ");
        float p = in.nextFloat();
        System.out.print("enter the interest rate i : ");
        float i = in.nextFloat();
        System.out.print("enter the time period n in year: ");
        float n = in.nextFloat();
        double c = compoundInterest(p,i,n);
        System.out.print("the compound interest is : "+c);
    }
    static double compoundInterest(float p , float i , float n){
        return p*(Math.pow((1+i), n)-1);
    }
}
