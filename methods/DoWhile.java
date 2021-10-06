package methods;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no = in.nextInt();
        doWhile(no);

    }

    static void doWhile(int no) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= no);
    }

}
