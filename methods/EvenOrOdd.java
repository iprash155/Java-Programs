package methods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no : ");
        int no = in.nextInt();
        boolean b = isEven(no);
        if (no == 0) {
            System.out.println("enter no > 0");
        } else {
            if (b) {
                System.out.println(no + " is even");
            } else {
                System.out.println(no + " is odd");
            }

        }
    }

    static boolean isEven(int a ){
       return a%2==0;
    }
}
