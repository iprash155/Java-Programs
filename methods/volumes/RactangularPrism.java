package methods.volumes;

import java.util.Scanner;

public class RactangularPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length: ");
        float  l= in.nextFloat();
        System.out.print("enter the height: ");
        float h = in.nextFloat();
        System.out.print("enter the bredth: ");
        float b=in.nextFloat();
        float v=volume(l,b,h);
        System.out.print("the volume is : "+v);
    }
    static float volume(float l ,float b,float h){
        return l*b*h;
    }
}
