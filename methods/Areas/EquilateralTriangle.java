package methods.Areas;

import java.util.Scanner;

/**
 * EquilateralTriangle
 */
public class EquilateralTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size if side : ");
        float s = in.nextFloat();
        double a = area(s);
        System.out.print("the area is: "+a);
    }
    static double area(float a){
        return (Math.sqrt(3)/4)*a*a;
    }
}