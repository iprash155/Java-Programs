package Basics.Area.IsoscelesTriangle;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter length equal side ");
        float b = in.nextFloat();
        System.out.print("enter other side ");
        float a = in.nextFloat();
        double area = a /2 * Math.sqrt((b*b)-((a*a)/4));
        System.out.println("the area is "+area);
    }
}
