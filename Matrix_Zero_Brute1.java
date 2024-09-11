import java.util.*;

public class Matrix_Zero_brute{
    public static void Zero(matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row(matrix[i][j]);
                    col(matric[i][j]);
                }
            }
        }

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
    public static void row(matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != 0){
                    matrix[i][j] = -1;

                }
            }
        }
    }

    public static void col(matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != 0){
                    matrix[i][j] = -1;
                }
            }
        }
    }
    public static void main(String args[]){
        matrix[][] = {1,1,1},
        {1,0,1},
        {1,1,1};
        System.out.println(Zero(matrix[][]));
    }
}