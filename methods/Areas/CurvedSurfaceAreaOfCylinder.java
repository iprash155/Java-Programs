package methods.Areas;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the rad : ");
        float rad = in.nextFloat();
        System.out.print("enter the height : ");
        float h = in.nextFloat();
        double a = curvedSurfaceAreaOfCylinder(rad,h);
        System.out.print("the area is : "+a);
    }
    static double curvedSurfaceAreaOfCylinder(float r ,float h){
        return 2.0*Math.PI*r*h;
    }
}
