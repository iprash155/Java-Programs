import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("enter no a ");
        double a = in.nextDouble();
        System.out.print("enter no b ");
        double b = in.nextDouble();
        System.out.print("choose operation from + - * / and % ");
        String operation = in.next();
        double result=0;
        
        if(operation.equals("+")){
            result = a+b;
        }
        else if(operation.equals("-")){
            result = a-b;
        }
        else if(operation.equals("*")){
            result = a*b;
        }
        else if(operation.equals("/")){
            result = a/b;
        }
        else if(operation.equals("%")){
            result = a%b;
        }
        System.out.println(a+" "+operation+" "+b+" ="+result);
    }
}
