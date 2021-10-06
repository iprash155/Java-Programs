package methods;

import java.util.Scanner;

public class Cgpa {
   public static void main(String[] args) {
       cgpa();
   } 
   static void cgpa(){
       int i=1;
       int sum=0;
       Scanner in = new Scanner(System.in);
       System.out.println("enter the no of subjects: ");
       int noOfSubs=in.nextInt();
       System.out.println("enter marks in different subjects");
       while (i<=noOfSubs) {
           int marks=in.nextInt();
           sum=sum+marks;
           i++;
       }
       float percentage = (sum*100)/(noOfSubs*100);
       float cgpa = percentage/9.5f;
       if (noOfSubs>0) {
        System.out.println("your cgpa is : "+cgpa);
       } else {
           System.out.println("enter no of subjects more than 0");
       }

   }
}
