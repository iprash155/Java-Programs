package methods.volumes;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius: ");
        float r=in.nextFloat();
        float v=volume(r);
        System.out.print("the volume is : "+v);
    }
    static float volume(float r){
        return(4.0f/3.0f)*3.14f*r*r*r;
    }
}
