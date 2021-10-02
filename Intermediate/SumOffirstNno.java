package Intermediate;
import java.util.Scanner;
public class SumOffirstNno {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the no n ");
        int n = in.nextInt();
        float sum = (n*(n+1)/2);
        System.out.println("the sum is "+sum);
    }
}
