package Basics.Volume.RactangularPyramid;


import java.util.Scanner;

public class RactangularPyramid {public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    System.out.println("enter length l ");
    float l = in.nextFloat();
    System.out.println("enter breadth b");
    float b = in.nextFloat();
    System.out.println("enter the height h ");
    float h = in.nextFloat();
    double volume = (l*b*h)/3.0;
    System.out.println("the volume is "+volume);

    
}
}
