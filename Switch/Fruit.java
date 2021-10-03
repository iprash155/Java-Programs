package Switch;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the fruit ");
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("the king of fruit");
                break;
            case "apple":
                System.out.println("the red sweet fruit ");
                break;
            case "orange":
            System.out.println("round fruit ");
            break;
            case "grapes":
                System.out.println("small fruit ");
                break;
            default:
                System.out.println("enter valid fruit");
               
        }
    }
}
