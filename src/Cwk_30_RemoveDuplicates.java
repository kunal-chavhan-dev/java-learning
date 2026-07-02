import java.util.Scanner;

public class Cwk_30_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        System.out.println("Enter 8 elements (with duplicates):");
        for (int i = 0; i < 8; i++)
            arr[i] = sc.nextInt();

        // Remove Duplicates
        int[] result = new int[8];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[count] = arr[i];
                count++;
            }
        }

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++)
            System.out.print(result[i] + " ");
    }
}
