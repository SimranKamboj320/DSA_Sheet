import java.util.*;

public class Matrix_Zero_brute {
    public static void Zero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Temporary arrays to mark rows and columns that need to be zeroed
        boolean[] rowFlag = new boolean[m];
        boolean[] colFlag = new boolean[n];

        // Traverse the matrix to mark the rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Set the marked rows to zero
        for (int i = 0; i < m; i++) {
            if (rowFlag[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set the marked columns to zero
        for (int j = 0; j < n; j++) {
            if (colFlag[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        Zero(matrix);

        // Print the matrix after setting zeros
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
