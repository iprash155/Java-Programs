import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.println("enter no ");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println("which no you want to count ");
        int no = in.nextInt();
        int count = 0;
        
        while(n!=0){
           int  r=(int)(n%10);
            if(r==no){
                count++;
            }
            n=n/10;
        }
        System.out.println(no+" occurs "+count+" times");
    }
}
