package methods;

import java.util.Scanner;

public class Intermediateq27 {
    public static void main(String[] args) {

        sums();

    }

    static void sums() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter series of no");
        int sumOfEvenNo = 0;
        int sumOfOddNo = 0;
        int sumOfNegativeNo = 0;
        while (true) {
            int no = in.nextInt();
            if (no == 0) {
                break;
            } else {
                if (no % 2 == 0) {
                    sumOfEvenNo = sumOfEvenNo + no;
                }
                if (no < 0) {
                    sumOfNegativeNo = sumOfNegativeNo + no;
                }
                if (no % 2 != 0) {
                    sumOfOddNo = sumOfOddNo + no;
                }
            }
        }
        System.out.println("the sum of even no: " + sumOfEvenNo);
        System.out.println("the sum of odd no: " + sumOfOddNo);
        System.out.println("the sum of negative no: " + sumOfNegativeNo);
    }
}
