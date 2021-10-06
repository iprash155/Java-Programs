package methods;

import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        long no = in.nextLong();
        System.out.print("which integer want to be checked : ");
        int i = in.nextInt();
        int n = count(no, i);
        System.out.println(i + " occurs " + n + " times");
    }

    static int count(long a, int no) {
        int counter = 0;
        while (a != 0) {
            int rem = (int) a % 10;
            if (rem == no) {
                counter++;
            }
            a /= 10;
        }
        return counter;
    }
}