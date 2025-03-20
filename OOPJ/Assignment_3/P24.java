import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the matrix (N x N)
        System.out.print("Enter the size of the matrix (N): ");
        int N = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[N][N];

        // Accept matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Rotate the matrix by 90 degrees clockwise in-place
        // Step 1: Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                // Swap elements matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row of the transposed matrix
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while (left < right) {
                // Swap elements matrix[i][left] with matrix[i][right]
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print the rotated matrix
        System.out.println("\nMatrix after 90 degree rotation:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
