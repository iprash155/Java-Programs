package Array;

public class ColumnNOtFixedSize {
    public static void main(String[] args) {
        array();
    }
    static void array(){
        int[][] arr = {{3,4,5},{6,7},{87,96,48}};
        for(int row = 0 ; row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

}
