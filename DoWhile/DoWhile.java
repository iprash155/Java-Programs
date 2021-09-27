import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("enter the no of count ");
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i<=no);
    }
    
}