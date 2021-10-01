package Basics.Area.Rhombus;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length of diagonal1 ");
        float d1 = in.nextFloat();
        System.out.print("enter the length of diagonal2 ");
        float d2 = in.nextFloat();
        double area = (d1*d2)/2;
        System.out.println("the area is "+area);
    }
}
