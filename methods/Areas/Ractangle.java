package methods.Areas;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length: ");
        float l = in.nextFloat();
        System.out.print("enter the width: ");
        float b = in.nextFloat();
        double a = area(l,b);
        System.out.println("the area is "+a);

    }
    static double area(float a , float b){
        return a*b;
    }
}
