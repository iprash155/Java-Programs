package Array.Assignment;

import java.util.Arrays;

public class ShuffleTheArrays {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = new int[nums.length];
       int j = 0 ;
       for (int i = 0; i < nums.length; i+=2) {
           ans[i]=nums[j];
            ans[i+1]=nums[n+j];
            j++;
       }
       System.out.println(Arrays.toString(ans));
    }
}
