public class P19 {
    public static void main(String[] args) {
        // Example matrix (m x n)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the number of rows and columns
        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        // Create a new matrix to store the transpose
        int[][] transpose = new int[n][m];

        // Compute the transpose by swapping rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
