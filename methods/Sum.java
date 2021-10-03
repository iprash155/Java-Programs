package methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("the ans is "+ans);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the n1 :");
        int n1 = in.nextInt();
        System.out.print("enter the n2 :");
        int n2 = in.nextInt();

        int sum=n1+n2;
        return sum;
    }
}
