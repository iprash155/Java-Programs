package Intermediate;


import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter nos ");
        int n1=in.nextInt();
        int n2=in.nextInt();
       
        int temp1=n1;
        int temp2=n2;
        int rem = n1%n2;
        int hcf;
       
        if (n1>n2) {
            while(rem!=0){
            rem=n1%n2;
             n1=n2;
             n2=rem;
             
             
            }
       hcf=n1;
        } else {
            while(rem!=0){
                rem=n2%n1;
                n2=n1;
                n1=rem;
               

               }
        hcf =n2;
        }
    int lcm = (temp1*temp2)/hcf;
    System.out.println("the lcm is "+lcm);
    }

}
