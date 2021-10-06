package methods;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no = in.nextInt();
        System.out.print("enter the power: ");
        int p = in.nextInt();
         
        
        long power = power(no,p);
        System.out.println(no+" power "+p+" = "+power);
    }
    static long power(int no ,int power){
        int mul=1;
        int i=1;
        while (i<=power) {
            mul=mul*no;
            i++;
        }
        return mul;
    }
}
