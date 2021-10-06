package methods.volumes;

import java.util.Scanner;

public class RactangularPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length l : ");
        float l = in.nextFloat();
        System.out.print("enter the bredth b: ");
        float b = in.nextFloat();
        System.out.print("enter the height h: ");
        float h = in.nextFloat();
        float v = volume(l,b,h);
        System.out.println("enter volume is: "+v);
    }
    static float volume(float l ,float b,float h){
        return (l*b*h)/3.0f;
    }
}
