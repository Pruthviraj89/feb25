import java.util.Scanner;

public class CountEO {
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

        // Variables to store counts of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Logic to count even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; // Even number
            } else {
                oddCount++;  // Odd number
            }
        }

        // Output the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
