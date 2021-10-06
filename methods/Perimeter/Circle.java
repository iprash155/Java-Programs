package methods.Perimeter;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius: ");
        float rad =in.nextFloat();
        float a = perimeter(rad);
        System.out.print("the perimeter is : ");
    }
    static float perimeter(float r){
        return 2.0f*3.14f*r;
    }
}
