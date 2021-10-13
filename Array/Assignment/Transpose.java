package Array.Assignment;

import java.util.Arrays;

public class Transpose {
        public static void main(String[] args) {
            int[][] mat = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    int temp = mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
                
            }
            System.out.println(Arrays.toString(mat));
        }
    }
    
