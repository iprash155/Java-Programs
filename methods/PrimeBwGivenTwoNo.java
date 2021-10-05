package methods;

import java.util.Scanner;

/**
 * PrimeBwGivenTwoNo
 */
public class PrimeBwGivenTwoNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the n1: ");
        int n1 = in.nextInt();
        System.out.print("enter the n2: ");
        int n2 = in.nextInt();
        
        primeNos(n1, n2);

    }

    static void primeNos(int a, int b) {
            if(a==1){
                a++;
                if(b>=2){
                    a++;
                }
            }
            if(a==0){
                a=a+2;
            }
        }
    }