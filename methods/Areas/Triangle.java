package methods.Areas;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter side1: ");
        float a = in.nextFloat();
        System.out.print("enter side2: ");
        float b = in.nextFloat();
        System.out.print("enter side3: ");
        float c = in.nextFloat();
        double area = area(a,b,c);
        System.out.println("the area is "+area);

    }
    static double area(float a , float b,float c){
        float s = (a+b+c)/2.0f;
        return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    
    
}
