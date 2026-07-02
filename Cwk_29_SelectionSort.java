import java.util.Scanner;

public class Cwk_29_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        // Selection Sort
        for (int i = 0; i < 5 - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
    }
}
