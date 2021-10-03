package methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
     
      swap();
    }
    static void swap(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = in.nextInt();
        System.out.println("enter b : ");
        int b = in.nextInt();

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+" b= "+b);
        
    }
}
