import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("enter the character ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println("this is smaller case");
        }
        else{
            System.out.println(ch+" is upper case");
        }

    }
}
