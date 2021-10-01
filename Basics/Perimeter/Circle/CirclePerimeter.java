package Basics.Perimeter.Circle;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius ");
        float rad = in.nextFloat();
        double perimeter  = 2*Math.PI*rad;
        System.out.println("the perimeter is "+perimeter);
    }
}
