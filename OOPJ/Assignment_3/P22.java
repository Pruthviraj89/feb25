import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        // Create Scanner object to accept user input
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
        
        // Find the maximum element in the matrix
        int maxElement = matrix[0][0];  // Initialize with the first element
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        
        // Print the maximum element
        System.out.println("\nThe maximum element in the matrix is: " + maxElement);
        

    }
}
