package Basics.Factors;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the no ");
        int no = in.nextInt();
        System.out.print("the factors are ");
        for(int i=1;i<=no;i++){
            int reminder=no%i;
            
            if(reminder==0)
                System.out.print(i+" ");

        }
        
    }
}
