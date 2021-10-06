package Basics.Area.Parallelogram;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the side 1 ");
        float side1= in.nextFloat();
        System.out.print("enter the side 2 ");
        float side2= in.nextFloat();
        System.out.println("enter acute angle between sides in degree ");
        float angle= (float) Math.toRadians(in.nextFloat());
        double area = side1*side2*Math.sin(angle);
        System.out.println("the area is "+area);
    }
}
