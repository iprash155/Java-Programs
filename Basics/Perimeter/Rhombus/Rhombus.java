package Basics.Perimeter.Rhombus;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the side ");
        float a = in.nextFloat();
        double perimeter = 4.0*a;
        System.out.println("the perimeter is "+perimeter);
    }
}
