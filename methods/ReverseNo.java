package methods;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no = in.nextInt();
        int r = reverseNo(no);
        System.out.print("reversed no is: "+r);
    }
    static int reverseNo(int no){
        int sum = 0;
        while (no!=0) {
            int rem=no%10;
            sum=sum*10+rem;
            no/=10;
        }
        return sum;
    }
}
