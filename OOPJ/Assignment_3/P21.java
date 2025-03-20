import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the dimensions of the matrix
        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[m][n];
        
        // Accept matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for position (" + (i+1) + "," + (j+1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Row-wise sum calculation
        System.out.println("\nRow-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
        }

        // Column-wise sum calculation
        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j+1) + ": " + colSum);
        }
        
    }
}
