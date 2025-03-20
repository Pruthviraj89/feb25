import java.util.Scanner;

public class SecondLarger {
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

        // Logic to find the second largest element
        if (n < 2) {
            System.out.println("Array does not have enough elements to find the second largest.");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                // Update the largest and second largest elements
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest element is: " + secondLargest);
            }
        }
    }
}
