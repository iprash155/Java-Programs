package Array;

import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 87, 96, 45 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }
}
