package methods;

import java.util.Scanner;

/**
 * PythagorusTriplet
 */
public class PythagorusTriplet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no a: ");
        float a = in.nextFloat();
        System.out.print("enter no b: ");
        float b = in.nextFloat();
        System.out.print("enter no c: ");
        float c = in.nextFloat();
        boolean s= isTriplet(a,b,c);
        if (s) {
            System.out.println("it is pythogoren triplet");
        } else {
            System.out.println("it isn't pythogoren triplet");
        }

    }
    static boolean isTriplet(float a , float b,float c){
        return a*a+b*b==c*c;
    }
}