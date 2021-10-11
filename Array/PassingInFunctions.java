package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array : ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);                                //will be changed . this is called mutability , is allowed for primitive data types and arrays except string in java 
        System.out.println("after changing");
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[2]=99;
    }
}
