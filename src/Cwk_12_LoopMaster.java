import java.util.ArrayList;
import java.util.List;
public class Cwk_12_LoopMaster {
    public static void main(String[] args) {
        // We initialize an empty list to store our processed results
        List<Integer> evenNumbers = new ArrayList<>();

        // This 'for' loop runs from 1 to 20 (inclusive)
        for (int i = 1; i <= 20; i++) {
            // Using the modulo operator to check if 'i' is even
            if (i % 2 == 0) {
                // If the condition is met, add it to our list
                evenNumbers.add(i);
                System.out.println("Processing: " + i + " (Even)");
            } else {
                // Otherwise, print a notification for odd numbers
                System.out.println("Skipping: " + i + " (Odd)");
            }
        }

        // Final report using a 'for-each' loop to print the result list
        System.out.println("--- Final Collected Evens ---");
        for (int num : evenNumbers) {
            System.out.println("Stored Value: " + num);
        }
    }
}