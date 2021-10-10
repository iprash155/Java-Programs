package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        // 1st way to print
        // for (int num : arr) {
        //     System.out.print(num+" ");
        // }

        //2nd Way of printing array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        //3rd and the best way to print array

        System.out.println(Arrays.toString(arr));
    }
}
