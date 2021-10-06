package Basics.Area.TriangleArea;

import java.util.Scanner;

/**
 * TriangleArea
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the side a ");
        float a = in.nextFloat();
        System.out.print("enter the side b ");
        float b = in.nextFloat();
        System.out.print("enter the side c ");
        float c = in.nextFloat();

        double area ;
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of the given triangle is "+area);
    }
}