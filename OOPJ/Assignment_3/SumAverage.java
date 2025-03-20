import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Variables to store the sum and average
        int sum = 0;
        double average;

        // Calculate sum of the elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate average of the elements
        average = (double) sum / n;

        // Output the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
