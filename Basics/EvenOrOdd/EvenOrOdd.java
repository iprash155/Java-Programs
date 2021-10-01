import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("enter the no ");
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();

        if(no%2==0){
            System.out.println(no +" is even");
        }
        else{
            System.out.println(no+" is odd");
        }
    }
}
