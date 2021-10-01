package Basics.SumOfAllInputNo;
/**
 * Take integer inputs till the user enters 0 and print the sum of all numbers 
 */
import java.util.Scanner;

public class SumOfAllInputNo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sum =0;
        System.out.println("enter no the nos");
        while (true) {
            int no=in.nextInt();
            if(no==0){
                break;
            }
           sum=no+sum;

        }
        System.out.println("the sum is "+sum);
    }
}
