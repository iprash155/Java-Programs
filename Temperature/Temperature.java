import java.util.Scanner;

import javax.tools.FileObject;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("enter temp in celcius ");
        float tempc = in.nextFloat();

        float tempf = (tempc*9/5)+32;

        System.out.println("temp in ferenheight is "+tempf);
    }
}
