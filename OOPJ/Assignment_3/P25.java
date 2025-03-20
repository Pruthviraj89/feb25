import java.util.Scanner;

public class P25 {
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

        // Calculate the diagonal sum
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < N; i++) {
            primaryDiagonalSum += matrix[i][i]; // primary diagonal element
            secondaryDiagonalSum += matrix[i][N - i - 1]; // secondary diagonal element
        }

        // If N is odd, subtract the middle element as it is counted twice
        if (N % 2 != 0) {
            int middleElement = matrix[N / 2][N / 2];
            primaryDiagonalSum -= middleElement;
        }

        // Output the results
        System.out.println("\nSum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);

    }
}
