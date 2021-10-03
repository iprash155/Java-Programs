package methods;

import java.util.Scanner;

public class SumWithArgument {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the n1");
        int n1=in.nextInt();
        System.out.print("enter the n2");
        int n2=in.nextInt();
        int ans = sum(n1,n2);
        System.out.println("the sum is "+ans);

    }
    static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}
