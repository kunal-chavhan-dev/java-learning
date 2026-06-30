
    import java.util.Scanner;

    public class Cwk_26_LinearSearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[5];

            // Array input
            System.out.println("Enter 5 elements:");
            for (int i = 0; i < 5; i++)
                arr[i] = sc.nextInt();

            // Number to search
            System.out.println("Enter number to search:");
            int key = sc.nextInt();

            // Linear Search
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element not found");
            }
        }
    }

