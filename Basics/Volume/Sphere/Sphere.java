package Basics.Volume.Sphere;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius ");
        double r = in.nextFloat();
        double volume =  (4.0/3.0) *(3.14* r * r * r);
        System.out.println("the volume is "+volume);
    }
}
