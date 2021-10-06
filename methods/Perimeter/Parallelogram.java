package methods.Perimeter;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter base l : ");
        float l= in.nextFloat();
        System.out.print("enter height h : ");
        float h = in.nextFloat();
        float p=perimeter(l,h);
        System.out.print("the perimeter is : "+p);
    }
    static float perimeter(float l ,float h){
        return 2.0f*(l+h);
    }
}
