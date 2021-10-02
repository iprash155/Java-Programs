package Intermediate;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no ");
        int no =in.nextInt();

        int sum=0;
        int i=1;
        if (no>1) {
            while(i<=no){
                if(no%i==0){
                    sum=sum+i;
                }
                i++;
            }
            if(sum==no){
                System.out.println("it is a perfect no ");
    
            }
            else {
                System.out.println("it is not perfect no");
            }
        } else {
            System.out.println("enter no >1");
        }
        
    }
}
