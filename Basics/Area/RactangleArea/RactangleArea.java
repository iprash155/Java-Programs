package Basics.Area.RactangleArea;

import java.util.Scanner;

public class RactangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length ");
        float l = in.nextFloat();
        System.out.print("enter width ");
        float w = in.nextFloat();
        double area = l*w;
        System.out.print("the area is "+area);
    }
}
