import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (n-1): ");
        int n_minus_1 = sc.nextInt();
        int n = n_minus_1 + 1;

        int[] arr = new int[n_minus_1];
        System.out.println("Enter the elements of the array (from 1 to " + n + ", but missing one number):");
        for (int i = 0; i < n_minus_1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum_n = n * (n + 1) / 2;
        int sum_arr = 0;
        for (int i = 0; i < n_minus_1; i++) {
            sum_arr += arr[i];
        }
		int missingNumber = sum_n - sum_arr;
        System.out.println("The missing number is: " + missingNumber);
    }
}
