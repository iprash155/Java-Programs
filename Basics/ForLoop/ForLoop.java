import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("enter the times you want to print ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i <=num ; i++) {
            System.out.println(i);
        }
    }
}
