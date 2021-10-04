package methods;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the age of the person: ");
        int age = in.nextInt();
        boolean b = isEligible(age);
        if (age == 0) {
            System.out.println("enter age > 0");
        } else {
            if (b) {
                System.out.println("the person is eligible");
            } else {
                System.out.println("the person is not eligible");
            }

        }

    }

    static boolean isEligible(int a) {
        return a > 18;
    }

}
