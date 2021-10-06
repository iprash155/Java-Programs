package methods.volumes;

import java.util.Scanner;

public class cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius r: ");
        float r = in.nextFloat();
        System.out.print("enter the height h: ");
        float h =in.nextFloat();
        float v=volume(r,h);
        System.out.print("the volume is : "+v);
    }
    static float volume(float r,float h){
        return 3.14f*r*r*(h/3.0f);
    }
}
