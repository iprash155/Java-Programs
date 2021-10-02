package Intermediate;

import java.util.Scanner;

public class ReverseAstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string ");
        String s= in.next().trim();
        System.out.print("reversed string is :");
        for(int i = s.length();i>=0;i--){
            System.out.print(s.charAt(i-1));
        }

    }
}
