import java.util.Scanner;

public class ReverseTheNo {
    public static void main(String[] args) {
        System.out.println("Enter the no ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("reversed no is ");
        while(n!=0){
            int r = n%10;
            System.out.print(r);
            n/=10;
        }
    }
}
