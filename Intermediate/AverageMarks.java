package Intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int sum=0;
        
        int count=0;
        Scanner in=new Scanner (System.in);
        System.out.println("enter the marks");
        while (true) {
            int marks;
            marks=in.nextInt();
            if (marks!=0) {
            sum=sum+marks;
            count++;
            } else {
                break;
            }
            
        }
        if (count>0) {
            int average = sum/count;
            System.out.println("the average is "+average);
        } else {
            System.out.println("enter more no of subject");
        }
       

    }
}
