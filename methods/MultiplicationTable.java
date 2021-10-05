package methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = in.nextInt();
        multiplicationTable(n);
    }
    static void multiplicationTable(int a ){
        for (int i = 1; i <=10; i++) {
            int mul=a*i;
            System.out.println(a+" "+i+" "+mul);
        }
    }
}
