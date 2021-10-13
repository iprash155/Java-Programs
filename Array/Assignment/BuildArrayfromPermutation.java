package Array.Assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BuildArrayfromPermutation
 */
public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        int[] ans = new int[size];

        if (size > 1000 || size < 1) {
            System.out.println("enter valid size");
        } else {
            System.out.println("enter the array elements for nums[]");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = in.nextInt();

            }
            System.out.println("nums[] = " + Arrays.toString(nums));
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0 || nums[i] >= nums.length) {
                    System.out.println("enter valid element");
                    break;
                }
            }

            boolean b = isSame(nums);
            if (b) {
                System.out.println("all element must be distinct");
            } else {
                for (int i = 0; i < ans.length; i++) {
                    ans[i] = nums[nums[i]];
                }
                System.out.println(Arrays.toString(ans));
            }

        }
    }

    static boolean isSame(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}