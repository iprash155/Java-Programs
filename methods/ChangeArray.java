package methods;

import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr = {1,56,8,45};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=99;

    }
}
