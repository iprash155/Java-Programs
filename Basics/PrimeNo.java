package Basics;

import java.util.Scanner;

/**
 * PrimeNo
 */
public class PrimeNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no ");
        int no = in.nextInt();

        int i = 2;
        int count=0;
        int flag = 0;

        if (no <= 1) {
            System.out.println("it is not prime no");
        } else if (i > Math.sqrt(no)) {
            System.out.println("it is prime no");
        }
        while (i <= Math.sqrt(no)) {
            if (no % i == 0) {
                flag = 1;
            }
            else{
                count=1;
            }
            i++;
        }
        if (flag == 1) {
            System.out.println("it is not prime no");
        } else if (count == 1) {
            System.out.println("it is prime no");
        }
    }
}