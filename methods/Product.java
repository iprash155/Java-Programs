package methods;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the n1: ");
        int n1 = in.nextInt();
        System.out.print("enter the n2: ");
        int n2 = in.nextInt();
        int mul= product(n1,n2);
        System.out.println("the product is "+mul);
    }
    static int product(int a , int b){
        return a*b;
    }
}
