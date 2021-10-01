package Basics.Volume.RactangularPrism;

import java.util.Scanner;

public class RactangualrPrism {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the lenght ");
        float l = in.nextFloat();
        System.out.println("enter the breadth ");
        float b = in.nextFloat();
        System.out.println("enter the height ");
        float h = in.nextFloat();
        double volume=l*b*h;
        System.out.println("the volume is "+volume);
    }



}
