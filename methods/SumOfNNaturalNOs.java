package methods;

import java.util.Scanner;

public class SumOfNNaturalNOs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no n : ");
        int n = in.nextInt();
        int s = sumOfNNaturalNos(n);
        System.out.print("the sum is: "+s);
    }
    static int sumOfNNaturalNos(int a){
        return a*(a+1)/2;
    }
}
