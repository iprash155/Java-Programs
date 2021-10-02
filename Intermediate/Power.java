package Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base n ");
        int n = in.nextInt();
        System.out.println("enter the power ");
        int p = in.nextInt();
        float mul=1 ;
        System.out.print(n+" power "+p+" = ");
        while(p>=1){
           mul=mul*n;
           p--;
        }
        System.out.print(mul);
        
    }
}
