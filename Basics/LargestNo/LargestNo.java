import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        System.out.println("enter the 2 no ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b){
            System.out.println("a is the largest no ");
        }
        else{
            System.out.println("b is the largest no ");
        }
    }
}
