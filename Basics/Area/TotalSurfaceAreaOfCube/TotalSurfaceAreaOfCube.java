package Basics.Area.TotalSurfaceAreaOfCube;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of side ");
        float a = in.nextFloat();
        double area = 6.0*a*a;
        System.out.println("the area is "+area);
    }
}
