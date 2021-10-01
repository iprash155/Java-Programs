package Basics.Area.EquilateralTriangle;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the side a ");
        float a = in.nextFloat();
        double area = (Math.sqrt(3)/4)*(Math.pow(a,2));
        System.out.println("the area is "+area);
    }
}
