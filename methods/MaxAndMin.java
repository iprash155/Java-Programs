package methods;

import java.util.Scanner;

/**
 * MaxAndMin
 */
public class MaxAndMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = in.nextInt();
        System.out.print("enter b: ");
        int b = in.nextInt();
        System.out.print("enter c: ");
        int c = in.nextInt();

        int max = max(a, b, c);
        int min = min(a, b, c);
        System.out.println("the maximun is " + max);
        System.out.println("the minimum is " + min);
    }

    static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;

        }
        if (b > a && b>c) {
                return b;
        }
        return c;
    }
    static int min(int a , int b,int c){
        if (a<b && a<c) {
            return a;
        }
        if(b<a && b<c){
            return b;
        }
        return c;
    }
}