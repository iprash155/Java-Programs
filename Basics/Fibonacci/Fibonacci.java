package Basics.Fibonacci;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the index til you want to print series ");
        int no = in.nextInt();
        int i=1,prev=0,count=3;
        System.out.print(prev);
        System.out.print(i);
        
        while (count<=no) {
            int temp =i;
            i=i+prev;
            prev=temp;  
            System.out.print(i+" ");
            count++;
        }
    }
}