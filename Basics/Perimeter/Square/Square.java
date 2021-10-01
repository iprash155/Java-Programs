package Basics.Perimeter.Square;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the side of square ");
        float a = in.nextFloat();
        System.out.println("the perimeter is "+4*a);
    }
}
