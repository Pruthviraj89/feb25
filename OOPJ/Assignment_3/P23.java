import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for dimensions of matrix A
        System.out.print("Enter the number of rows for Matrix A (m): ");
        int m = sc.nextInt();
        
        System.out.print("Enter the number of columns for Matrix A (n): ");
        int n = sc.nextInt();
        
        // Ask the user for dimensions of matrix B
        System.out.print("Enter the number of rows for Matrix B (n): ");
        int n2 = sc.nextInt();
        
        System.out.print("Enter the number of columns for Matrix B (p): ");
        int p = sc.nextInt();
        
        // Check if the multiplication is possible (columns of A should be equal to rows of B)
        if (n != n2) {
            System.out.println("Matrix multiplication is not possible. The number of columns of Matrix A must be equal to the number of rows of Matrix B.");
            sc.close();
            return;
        }

        // Initialize matrices A and B
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][p];
        
        // Accept elements of Matrix A
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Accept elements of Matrix B
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Initialize the result matrix C
        int[][] result = new int[m][p];

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                result[i][j] = 0; // Initialize the element to 0
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("\nResultant Matrix (C = A * B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
