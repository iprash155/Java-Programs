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

        if (arr.length == 0) {
            System.out.println("the array is empty");
        } else {
            System.out.println("enter starting index and ending index of the range: ");
            int start = in.nextInt();
            int end = in.nextInt();
            if (end < start) {
                System.out.println("end must be = or > start");
            } else {
                int m = max(arr, start, end);
                System.out.println("the maximum in given range is : " + m);
            }
        }

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
