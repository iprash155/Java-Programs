package Basics.Perimeter.EquilateralTriangle;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the legnth of side ");
        float a = in.nextFloat();
        System.out.println("the perimeter is "+3*a);
    }
}
