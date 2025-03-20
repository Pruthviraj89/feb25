import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize an array of size 20
        int[] numbers = new int[20];
        
        // Accept 20 integer numbers from the user
        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize counters for even numbers, odd numbers, and multiples of 3
        int even = 0, odd = 0, multiple3 = 0;

        // Loop through the array and check each number
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                even++; // Count even numbers
            } else {
                odd++;  // Count odd numbers
            }

            if (numbers[i] % 3 == 0) {
                multiple3++; // Count multiples of 3
            }
        }

        // Display the results
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of multiples of 3: " + multiple3);
    }
}
