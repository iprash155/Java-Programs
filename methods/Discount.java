package methods;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the discount in %: ");
        int d = in.nextInt();
        System.out.print("enter the amount of the product: ");
        int amount = in.nextInt();
        float dis = discount(d,amount);
        System.out.println("the total amount to pay is: "+dis);
    }
    static float discount(int d,int amount){
        return amount-(amount*d/100);
    }
}
