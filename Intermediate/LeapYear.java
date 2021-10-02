package Intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = in.nextInt();
        
        if(year%4==0&&year%100==0&&year%400==0){
            System.out.println("IT IS LEAP YEAR");
        }
        else{
            System.out.println("it is not a leap year");
        }
    } 
}
