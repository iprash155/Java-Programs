package methods.Perimeter;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter length l: ");
        float l = in.nextFloat();
        System.out.print("enter bredth b: ");
        float b = in.nextFloat();
        float p=perimeter(l,b);
        System.out.print("the perimeter is : "+p);
    }
   
    static float perimeter(float l , float b)
    {
        return 2.0f*(l+b);
    }
}
