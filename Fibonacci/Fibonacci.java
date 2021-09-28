import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("enter the index n ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int p =0;
        int i = 1;
        int count=2;

        while(count<=n){
            int temp=i;
            i=p+i;
            p=temp;
            count++;
            System.out.println(p);
        }
        System.out.println(n+"th no is "+i);
    }
}
