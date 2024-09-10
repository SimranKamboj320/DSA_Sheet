import java.util.*;

public class Matrix_Zero_Better{
    public static void Matrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int row[] = new int[m];
        int col[] = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] == 1 || col[j] ==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String args[]){
        int matrix[][] = {
        {1,1,1},
        {1,0,1},
        {1,1,1}
        };

        Matrix(matrix);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}