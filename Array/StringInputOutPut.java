package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringInputOutPut{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string array : ");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}