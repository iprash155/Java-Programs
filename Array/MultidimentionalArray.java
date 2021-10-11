package Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * MultidimentionalArray
 */
public class MultidimentionalArray {

    public static void main(String[] args) {
        array2d();
    }
    static void array2d(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the array objects: ");
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= in.nextInt();
            }
        }

        //1st way of printing array
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        

        //2nd way of printing array
        // for (int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }

        //3rd way of printing an array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}