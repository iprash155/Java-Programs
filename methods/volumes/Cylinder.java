package methods.volumes;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius: ");
        float r =  in.nextFloat();
        System.out.print("enter the height: ");
        float h = in.nextFloat();
        float v=volume(r,h);
        System.out.print("the volume is : "+v);
    }
    static float volume(float r,float h){
        return 2.0f*3.14f*r*h;
    }
}
