import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter principle ");
        float p = in.nextFloat();
        System.out.print("enter time ");
        float t = in.nextFloat();
        System.out.print("enter rate ");
        float r = in.nextFloat();

        double SI = p*r*t;
        
        System.out.println("your Simple interest is "+SI);
    }
}