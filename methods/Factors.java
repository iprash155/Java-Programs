package methods;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no = in.nextInt();
        factors(no);
    }
    static void factors(int no){
        System.out.println("factors of "+no+" are : ");
        for (int i = 1; i <=no; i++) {
            if (no%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
