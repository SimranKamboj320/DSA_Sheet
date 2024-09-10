import java.util.Scanner;

public class AlternatingMatrix {

    // Function to create an m x n matrix with alternating X and 0 rectangles
    public static void createMatrix(int m, int n) {
        char[][] matrix = new char[m][n];  // Create the matrix to store X and 0
        char fillChar = 'X';  // Start with 'X'
        int startRow = 0, endRow = m - 1, startCol = 0, endCol = n - 1;

        // Fill the matrix in alternating rectangles
        while (startRow <= endRow && startCol <= endCol) {
            // Fill top row
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = fillChar;
            }
            startRow++;

            // Fill right column
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = fillChar;
            }
            endCol--;

            // Fill bottom row
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    matrix[endRow][i] = fillChar;
                }
                endRow--;
            }

            // Fill left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = fillChar;
                }
                startCol++;
            }

            // Alternate between 'X' and '0' for the next rectangle
            if (fillChar == 'X') {
                fillChar = '0';
            } else {
                fillChar = 'X';
            }
            
        }

        // Print the resulting matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Create and display the matrix
        createMatrix(m, n);

        scanner.close();
    }
}
