package methods;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the nos: ");
        int a= in.nextInt();
        int b = in.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        swap(a,b);
    }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a after swap: "+a);
        System.out.println("b after swap: "+b);
    }
}
