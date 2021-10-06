package methods;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the character : ");
        char ch = in.next().trim().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            boolean b = isCapital(ch);
            if (b) {
                System.out.println("it is uppercase");
            } else {
                System.out.println("it is lowercase");
            }
        } else {
            System.out.println("enter alphbet");
        }

    }

    static boolean isCapital(char ch) {

        return (ch >= 'A' && ch <= 'Z');
    }

}
