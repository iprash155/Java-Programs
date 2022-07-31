import java.util.*;

public class PrimesBw2Nos{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        primeNos(a, b);


    }

    static void primeNos(int a , int b){
        for (int i = a; i <=b; i++) {
            int flag=1;
            if (i<=1) {
                continue;
            } else {
                // decides if perticular i is prime or not
                    int c=2;
                    while (c<=Math.sqrt(i)) {
                        if(i%c==0){
                            flag=0;
                            break;
                        }
                        c++;
                    }
                    if (flag==1) {
                        System.out.print(i+" ");
                    }
            }
        }
     }
}
