package Basics.Volume.Cone;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius r ");
        float rad = in.nextFloat();
        System.out.println("enter the height h ");
        float height = in.nextFloat();
        double volume = Math.PI*(rad*rad)*height/3;
        System.out.println("the volume is "+volume);
    }
}
