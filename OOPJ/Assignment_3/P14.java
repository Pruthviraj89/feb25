import java.util.Scanner;
import java.util.ArrayList;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the array arr[20] to store the numbers
        int[] arr = new int[20];

        // Input: Accept 20 numbers from the user
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        // Create ArrayLists to store even and odd numbers
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Transfer even and odd numbers into respective arrays
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);  // Even numbers go into the 'even' list
            } else {
                odd.add(arr[i]);   // Odd numbers go into the 'odd' list
            }
        }

        // Print even numbers
        System.out.println("Even numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }
        System.out.println();  // For a new line

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }
        System.out.println();  // For a new line
    }
}
