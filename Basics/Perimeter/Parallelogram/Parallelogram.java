package Basics.Perimeter.Parallelogram;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base ");
        float base = in.nextFloat();
        System.out.println("enter the side ");
        float side = in.nextFloat();
        double perimeter = 2*(base+side);
        System.out.println("the perimeter is "+perimeter);
    }
}
