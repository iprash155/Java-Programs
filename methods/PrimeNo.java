package methods;

import java.util.Scanner;

/**
 * PrimeNo
 */
public class PrimeNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no :");
        int no = in.nextInt();
        boolean b =isPrime(no);
        if (b) {
            System.out.println("it is prime no");
        }
        else{
            System.out.println("it is not prime no");
        }
    }
    static boolean isPrime(int no){
        int i=2;
        if (no<=1) {
            return false;
        }
        else if(i>Math.sqrt(no))
        {
            return true;

        }
        while (i<=Math.sqrt(no)) {
            if (no%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}