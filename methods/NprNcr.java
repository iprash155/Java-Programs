package methods;

import java.util.Scanner;

public class NprNcr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = in.nextInt();
        System.out.print("enter r : ");
        int r = in.nextInt();
        if (r <= n) {
            long p = npr(n, r);
            long c = ncr(n, r);
            System.out.println(n + "p" + r + "=" + p);
            System.out.println(n + "c" + r + "=" + c);
        } else {
            System.out.println("r should be > n");
        }

    }

    static long npr(int n, int r) {
        int nMinusR = n - r;
        int mul = 1;
        int product = 1;
        while (n>= 1) {
            mul = mul * n;
            n--;
        }
        while (nMinusR >= 1) {
            product = product * nMinusR;
            nMinusR--;
        }
        return mul / product;
    }

    static long ncr(int n, int r) {
        int nMinusR = n - r;
        int mul = 1;
        int gunakar = 1;
        int product = 1;
        while (n >= 1) {
            mul = mul * n;
            n--;
        }
        while (nMinusR >= 1) {
            product = product * nMinusR;
            nMinusR--;
        }
        while (r >= 1) {
            gunakar = gunakar * r;
            r--;
        }

        return mul / gunakar * product;
    }
}
