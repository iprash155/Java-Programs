package Basics.CircleArea;

import java.util.Scanner;

/**
 * CircleArea
 */

public class CircleArea {

    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        double area = 3.14*(Math.pow(rad,2));

        System.out.println("area = "+area);
    }
}