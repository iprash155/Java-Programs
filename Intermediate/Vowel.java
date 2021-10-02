package Intermediate;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter character ");
        char ch = in.next().trim().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                System.out.println("it is vowel");
            } 
            else {
                System.out.println("this is consonant");
            }
        }
        else {
            System.out.println("enter character");
        }

    }
}
