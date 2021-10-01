import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args) {
        System.out.print("enter amount in Rs ");
        Scanner in = new Scanner(System.in);
        double rs = in.nextDouble();

        double usd = rs*74.05;

        System.out.println("your amount in usd is "+usd);
    }
}
