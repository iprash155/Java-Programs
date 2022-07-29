import java.util.*;

public class Test{
    public static void main(String[] args) {
        System.out.println("enter the nos");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int hcf = 0;
        int rem = n2%n1;
        int a =n1;
        int b = n2;

        if (n2>n1) {
            if (n2%n1==0) {
                hcf=n1;
            } else {
                while(rem!=0){
                    rem = n2%n1;
                    n2 = n1;
                    n1 = rem;
                }
            
                hcf = n2;
            }    
            
        } else {
            if (n1%n2==0) {
                hcf=n2;
            } else {
                while (rem!=0) {
                    rem = n1%n2;
                    n1=n2;
                    n2=rem;
                }
                hcf=n1;
            }
            
        }

        int lcm = a*b/hcf;
       System.out.println("lcm is "+lcm+", hcf is "+hcf); 
    }

}
