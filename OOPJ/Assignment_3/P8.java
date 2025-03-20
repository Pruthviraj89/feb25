import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        
        // Create the second sorted array
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Logic to merge two sorted arrays without extra space
        int i = n1 - 1, j = 0;
        
        // Merge the two arrays by comparing and shifting elements
        while (i >= 0 && j < n2) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                
                // Sort arr2[j] in its correct position
                int k = j + 1;
                while (k < n2 && arr2[k] < arr2[k - 1]) {
                    int temp2 = arr2[k];
                    arr2[k] = arr2[k - 1];
                    arr2[k - 1] = temp2;
                    k++;
                }
            }
            i--;
            j++;
        }

        // Output the merged array
        System.out.println("The merged sorted array is:");
        for (int x = 0; x < n1; x++) {
            System.out.print(arr1[x] + " ");
        }
        for (int x = 0; x < n2; x++) {
            System.out.print(arr2[x] + " ");
        }
    }
}
