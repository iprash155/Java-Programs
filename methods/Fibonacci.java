package methods;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the index : ");
        int i = in.nextInt();
        fibonacci(i);
    }

    static void fibonacci(int i) {
        int a = 0;
        int b = 1;

        int count = 3;
        if (i == 0) {
            System.out.print("enter index > 0");
        } else if (i == 1) {
            System.out.print(a);
        } else if (i >= 2) {
            System.out.print(a+" "+b);
        }
        while (count <= i) {
            int temp = b;
            b = a + b;
            a = temp;

            System.out.print(" "+b+" ");
            count++;
        }
    }
}
