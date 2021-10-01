package Basics.Calcualtor;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      
      
        Scanner in = new Scanner(System.in);
    
       

        while (true) {
            System.out.println("enter oprands ");
            int n1=in.nextInt();
            int n2 =in.nextInt();
            
            System.out.println("enter the operator ");
            char operator = in.next().trim().charAt(0);
            
            if (operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%') {
                if (operator=='+') {
                    System.out.println(n1+n2);
                }
                if (operator=='-') {
                    System.out.println(n1-n2);
                }
                if (operator=='*') {
                    System.out.println(n1*n2);
                }
                if (operator=='/') {
                    if (n2!=0) {
                        System.out.println(n1/n2);
                    }
                
                }
                if (operator=='%') {
                    System.out.println(n1%n2);
                }

            }else if (operator=='x'||operator=='X') {
                break;
            } 
            else {
                System.out.println("invalid operator");
            }
        }
    }
}
