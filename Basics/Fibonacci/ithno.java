package Basics.Fibonacci;

import java.util.Scanner;

public class ithno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("which index to be printed ");
        int index = in.nextInt();
        int prev=0;
        int i = 1;
        int count =3;

        while(count<=index){
            int temp = i;
            i=i+prev;
            prev=temp;
            count++;
        }
        System.out.println("the Fibonacci no is "+i);
    }
}
