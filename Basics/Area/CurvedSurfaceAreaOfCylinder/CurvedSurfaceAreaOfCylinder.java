package Basics.Area.CurvedSurfaceAreaOfCylinder;

import java.util.Scanner;

/**
 * CurvedSurfaceAreaOfCylinder
 */
public class CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rad ");
        float r = in.nextFloat();
        System.out.println("enter the height ");
        float h = in.nextFloat();
        double area = 2.0*Math.PI*r*h;
        System.out.println("the area is "+area);
    }
}