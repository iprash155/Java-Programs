package methods.Areas;

import java.util.Scanner;

public class Parallalogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter side1 : ");
        float s1 = in.nextFloat();
        System.out.print("enter side2: ");
        float s2  = in.nextFloat();
        System.out.print("enter the angle in degree: ");
        float angle = (float) Math.toRadians(in.nextFloat());
        double a = area(s1,s2,angle);
        System.out.println("the area is : "+a);

    }
    static double area(float a ,float b,float d){
        return a*b*Math.sin(d);
    }
}
