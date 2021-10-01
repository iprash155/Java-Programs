package Basics.Perimeter.Ractangle;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the legnth l ");
        float l = in.nextFloat();
        System.out.println("enter the height h ");
        float h  = in.nextFloat();
        double perimeter = 2*(l+h);
        System.out.println("the perimeter is "+perimeter);
    }
}
