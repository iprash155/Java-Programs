package methods;

import java.util.Scanner;

public class RsToDollar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the amount in RS: ");
        float rs = in.nextFloat();
        float d = rsToDollor(rs);
        System.out.print("the amount is USd is: " + d);
    }

    static float rsToDollor(float rs) {
        return rs / 74.54f;
    }
}