package Intermediate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        int noOfMatches = 0;
        int sum =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the runs scored in different mathches ");
        while(true){
            int runs=in.nextInt();
            if(runs==0){
                break;
            }
           
            sum = sum+runs;   
            noOfMatches++;
        }
        float average=sum/noOfMatches;
        System.out.println("the average is "+average);
    }
}
