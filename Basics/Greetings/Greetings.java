import java.util.Scanner;

public class Greetings{

    public static void main(String[] args) {
        System.out.print("what is your name ");
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println("hello "+name+" welcome to java programs");
    }
}