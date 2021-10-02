package Intermediate;

import java.util.Scanner;

public class NprAndNcr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n ");
        int n = in.nextInt();
        System.out.println("enter r ");
        int r = in.nextInt();

        int temp1 = n;
        int temp2 = r;
        int NminusR = n - r;
        int fact_n = 1;
        int fact_r = 1;
        int factNminusR = 1;

        // fact_n
        while (n >= 1) {
            fact_n = fact_n * n;
            n--;
        }

        // fact_r
        while (r >= 1) {
            fact_r = fact_r * r;
            r--;
        }

        // factNminusR
        while (NminusR >= 1) {
            factNminusR = factNminusR * NminusR;
            NminusR--;
        }

        // Npr
        float npr = (fact_n) / (factNminusR);

        // Ncr
        float ncr = (fact_n) / ((fact_r) * (factNminusR));

        if (temp1 <= 0 || temp2 <= 0) {
            System.out.println("enter n and r >0");
        } else if (temp1 < temp2) {
            System.out.println("n should be greater than r ");
        } else {
            System.out.println(temp1 + "P" + temp2 + " is " + npr);
            System.out.println(temp1 + "c" + temp2 + " is " + ncr);
        }

    }

}
