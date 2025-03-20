import java.util.Scanner;

public class LargerSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Creating the array
        int[] arr = new int[n];
        
        // Taking user input for the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize smallest and largest
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Output the results
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
    }
}
