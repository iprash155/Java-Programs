package methods.Perimeter;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the side a : ");
        float a = in.nextFloat();
        float p=perimeter(a);
        System.out.print("the perimeter is : "+p);
    }
    static float perimeter(float a){
        return 3.0f*a;
    }
}
