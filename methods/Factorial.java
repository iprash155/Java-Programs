package methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no: ");
        int no = in.nextInt();
        long f =factorial(no);
        System.out.print(no+"! = ");
        for (int i = no; i >=1 ; i--) {
            if(i==1){
                System.out.print(i+" = ");
            }else{
            System.out.print(i+" * ");
            }
            
        }
        System.out.print(f);
    }
    static long factorial(int n){
        long mul =1;
        for (int i = n; i>=1; i--) {
            mul=mul*n;
        }
        return mul;
    }
}
