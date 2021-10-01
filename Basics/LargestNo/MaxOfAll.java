package Basics.LargestNo;

import java.util.Scanner;

/**
 * Take integer inputs till the user enters 0 and print the largest number from all.
 */
public class MaxOfAll {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the nos");
        int i=0;
        int max=0;
        int prev=0;
        while (true) {
            i=in.nextInt();
           
                if (i==0) {

                     break;    
                } 
                else {
                    if(i>prev){
                     int temp=i;
                     max=i;
                     prev=temp;
                    }  
                }
        }
        System.out.println("the max no is "+max);
    }
}
