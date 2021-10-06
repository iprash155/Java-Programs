package methods;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        battingAverage();
    }
    static void battingAverage(){
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.print("enter the no of matches: ");
        int noOfMatches = in.nextInt();
        System.out.println("enter the score for"+noOfMatches+" matches");
        int i=1;
        while (i<=noOfMatches) {
            int scores = in.nextInt();
             sum = sum+scores;
            i++;
        }
        if (noOfMatches>0) {
            int battingAverage=sum/noOfMatches;
            System.out.print("the battingAverage is : "+battingAverage);
        }
        else{
            System.out.println("enter no of matches");
        }
        
    }
}
