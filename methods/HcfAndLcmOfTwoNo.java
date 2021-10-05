package methods;

import java.util.Scanner;

/**
 * HcfAndLcmOfTwoNo
 */
public class HcfAndLcmOfTwoNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n1 and n2 : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = hcf(a, b);
 
        System.out.println("the hcf is " + hcf);
        System.out.println("the lcm is " + (a*b)/hcf);
    }

    static int hcf(int a, int b) {

        if (a > b) {
            int rem = a % b;
            while (true) {
                if (rem == 0) {
                    return b;
                }
                a = b;
                b = rem; 
                rem = a % b;
            }
        } else {
            int rem = b%a;
            while (true) {
                if (rem == 0) {
                    return a;
                }
                b = a;
                a = rem;   
                rem = b % a;
            }
        }
    }
    
}