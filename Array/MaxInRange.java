package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter starting index and ending index of the range: ");
        int start = in.nextInt();
        int end = in.nextInt();

        int m = max(arr, start, end);
        System.out.println("the maximum in given range is : " + m);
    }

    static int max(int[] a, int s, int e) {
        int max = a[s];
        for (int i = s; i <= e; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

}
