package methods;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the character: ");
        char c = in.next().trim().charAt(0);
        if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
            boolean b=isVowel(c);
            if (b) {
               System.out.println("it is vowel");
            } else {
                System.out.println("it is consonent");
            }
        } else {
            System.out.println("enter alphabet");
        }
    }
    static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
}
