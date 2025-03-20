import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: the target sum
        System.out.print("Enter the sum S: ");
        int S = sc.nextInt();

        // Main logic to find the subarray with sum S
        int start = 0;
        int currentSum = 0;
        
        // Loop through the array with the 'end' pointer
        for (int end = 0; end < n; end++) {
            currentSum += arr[end]; // Add the current element to the running sum

            // Shrink the window if the current sum exceeds the target sum
            while (currentSum > S && start <= end) {
                currentSum -= arr[start]; // Remove the element at 'start' from the sum
                start++; // Move the start pointer to the right
            }

            // If the current sum equals the target sum, print the subarray
            if (currentSum == S) {
                System.out.println("Subarray with sum " + S + " is found between indices " + start + " and " + end);
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return; // Exit after finding the first subarray
            }
        }

        // If no subarray is found
        System.out.println("No subarray with the given sum " + S + " was found.");
    }
}
