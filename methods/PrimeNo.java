package methods;

import java.util.Scanner;

/**
 * PrimeNo
 */
public class PrimeNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no : ");
        int no = in.nextInt();
        boolean b = isPrime(no);
        if(b==true){
            System.out.println("it is prime no");
        }
        else{
            System.out.println("it is not prime no");
        }
    }
    static boolean isPrime(int a){
        int i=2;
        int count=0;
        int temp=0;
        if (a<=1) {
            return false;
        } 
        while(i<=Math.sqrt(a)){
            if(a%i==0){
                return false;
            }
            i++;
        }
        return true;
        
    }
}