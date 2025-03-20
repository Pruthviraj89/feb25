import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Array is empty.");
        } else {
            int index = 1;

            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    arr[index] = arr[i];
                    index++;
                }
            }
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
