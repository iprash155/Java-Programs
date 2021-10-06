package methods.Areas;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the side: ");
        float a=in.nextFloat();
        System.out.print("enter the side which 2 are same:  ");
        float b=in.nextFloat();
        double area = area(a,b);
        System.out.print("the area is : "+area);
    }
    static double area(float a,float b){
        return a /2 * Math.sqrt((b*b)-((a*a)/4));
    }
}
