package methods;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name =in.next();
        String personalized = greetings(name);
        System.out.println(personalized);
    }
    static String greetings(String name){
        return "hello "+name;
    }

}
