import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = in.nextInt();
        int c = 2;
        if (no==1) {
            System.out.println("it is not prime");
        } else {
            while(c<no){
                if(no%c==0){
                    System.out.println("it is not prime ");
                }
                else{
                    System.out.println("it is prime");
                }
                c++;
            }
        }
    }
}
