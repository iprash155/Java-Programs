package Intermediate;
import java.util.Scanner;
public class AverageOfFirstNNos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no n ");
        int n = in.nextInt();
        float avg=(float)(n+1)/2;
        System.out.println("the average is "+avg);
    
    }
}
