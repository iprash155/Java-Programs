package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOfElements {
    public static void main(String[] args) {
        swap();
    }

    static void swap() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements of the array");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter indexes to be swapped: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if ((a >= 0 && a < 5) && (b >= 0 && b < 5)) {
            System.out.println("before swapping array: ");
            System.out.println(Arrays.toString(arr));
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            System.out.println("after swapping");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("enter valid index");
        }

    }
}
