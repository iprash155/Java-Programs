package methods;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string: ");
        String s = in.next().trim();
        reversedString(s);
       
    }
    static void reversedString(String s){
        System.out.print("the reversed string is : ");
        for (int i = s.length(); i>=1; i--) {
            
            System.out.print(s.charAt(i-1));
        }

    }
    
}
