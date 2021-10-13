package Array;

/**
 * SameArrayelement
 */
public class SameArrayelement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements : ");
        int[] arr = new int[5];
        boolean b = isSameElement(arr);
        if (b) {
            System.out.println("some elements are same");
        } else {
            System.out.println("no elements are same");
        }
    }
    static boolean isSameElement(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
        }
    }
}