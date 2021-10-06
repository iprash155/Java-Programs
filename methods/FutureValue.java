package methods;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the investment amount: ");
        float  i = in.nextFloat();
        System.out.print("enter the interesst rate in %: ");
        float  r = in.nextFloat();
        System.out.print("enter the no of years t: ");
        float  t = in.nextFloat();
        float f = value(i,r,t);
        System.out.print("the future value is : "+f);
    }
    static float value(float i ,float r ,float t){
        return i*(1+(r*t));
    }
}
