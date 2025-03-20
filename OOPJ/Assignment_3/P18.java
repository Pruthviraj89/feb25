public class P18 {
    public static void main(String[] args) {
        // Example m x n matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the number of rows and columns
        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        // Print all elements row-wise
        System.out.println("Matrix elements row-wise:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
