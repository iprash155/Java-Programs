package Basics.Volume.Cylinder;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius ");
        float r = in.nextFloat();
        System.out.println("enter the height ");
        float h = in.nextFloat();
        double volume = Math.PI*(Math.pow(r, 2))*h;
       
        System.out.println("the volume is "+volume);
    }
}
