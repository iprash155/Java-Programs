package Intermediate;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter nos ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int rem = n1%n2;
        if (n1>n2) {
            while(rem!=0){
            rem=n1%n2;
             n1=n2;
             n2=rem;
             
             
            }
        System.out.println("hcf is "+n1);
        } else {
            while(rem!=0){
                rem=n2%n1;
                n2=n1;
                n1=rem;
               

               }
               System.out.println("hcf is "+n2);

        }
    }

}
