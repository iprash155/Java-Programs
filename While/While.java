import java.util.Scanner;

public class While {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.print("enter the count ");
        int count = in.nextInt();
        int i =1;
        while(i<=count){
            System.out.println(i);
            i++;
        }
   } 
}
