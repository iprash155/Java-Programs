package methods.Areas;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the diagonal1: ");
        float d1 = in.nextFloat();
        System.out.print("enter the digonal2: ");
        float d2 = in.nextFloat();
        double a = area(d1,d2);
        System.out.print("the area is : "+a);

    }
    static double area(float d1,float d2){
        return (d1*d2)/2;
    }
}
