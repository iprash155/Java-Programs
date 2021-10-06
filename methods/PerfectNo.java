package methods;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no = in.nextInt();

        if (no > 1) {
            boolean b = isPerfectNo(no);
            if (b) {
                System.out.println("it is a perfect no");
            } else {
                System.out.println("it is not a perfect no");
            }
        } else {
            if (no == 1) {
                System.out.println("it is nota perfect no");
            } else {
                System.out.println("enter +ve no");
            }
        }

    }
     static boolean isPerfectNo(int no){
         int i=1;
         int sum =0;
         while (i<no) {
             if(no%i==0){
                sum=sum+i;
             }
             i++;
         }
         return sum==no;
     }
}
