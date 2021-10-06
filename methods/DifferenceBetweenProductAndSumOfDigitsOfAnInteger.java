package methods;

import java.util.Scanner;

public class DifferenceBetweenProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        long no = in.nextLong();
        long d = difference(no);
        System.out.println("the DifferencecBetweenc Product And Sum Of Digits Of An Integer: "+d);
    }
    static long difference(long no){
        long mul =1;
        long sum = 0;
        while (no!=0) {
            int rem =(int) no%10;
            mul = mul*rem;
            sum=sum+rem;
            no/=10;
        }
        return mul-sum;
    }
}
