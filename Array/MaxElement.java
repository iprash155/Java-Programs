package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the array element: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int a = max(arr);
        System.out.println("the maximum element is : "+a);
    }
    static int max(int[] a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
}
