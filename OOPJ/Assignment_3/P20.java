public class P20 {
    public static void main(String[] args) {
       
        int[][] matrix1 = {
            {4, 2, 3},
            {2, 8, 6},
            {7, 6, 9}
        };
        
        int[][] matrix2 = {
            {8, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Get the number of rows and columns
        int m = matrix1.length;       
        int n = matrix1[0].length;    

        int[][] sumMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
