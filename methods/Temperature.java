package methods;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the temp in celcius: ");
        double c = in.nextDouble();
        double f = cTf(c);
        System.out.print("the "+c+" in ferenheight is: "+f);
    }

    static double cTf(double c){
        double f;
        f=  (c * 9/5) + 32;
        return f;


    }
}
