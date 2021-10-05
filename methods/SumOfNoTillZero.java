package methods;

import java.util.Scanner;

public class SumOfNoTillZero {
    public static void main(String[] args) {

        int a = sum();
        System.out.println("the total sum is " + a);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter nos : ");

        int sum = 0;
        while (true) {
            int a = in.nextInt();
            if ((a == 0)) {
                break;
            }
            sum = sum + a;
        }
        return sum;
    }
}
