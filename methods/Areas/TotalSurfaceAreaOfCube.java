package methods.Areas;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length of side a : ");
        float a =  in.nextFloat();
        double s = area(a);
        System.out.println("the area is: "+s);
    }
    static double area(float a){
        return 6*a*a;
    }
}
