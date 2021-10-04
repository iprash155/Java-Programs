package methods;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius : ");
        float rad = in.nextFloat();
        double a = area(rad);
        double b = circumference(rad);
        System.out.println("the area is: " + a);
        System.out.println("the circumference is: " + b);
    }

    static double area(float r) {
        return Math.PI * r * r;
    }

    static double circumference(float r) {
        return 2 * Math.PI * r;
    }

}
