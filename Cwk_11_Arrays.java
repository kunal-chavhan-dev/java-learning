public class Cwk_11_Arrays {
    public static void main(String[] args) {
/**
 * A program to find the Maximum and Minimum values in an array.
 */
                // Initialize an array with some random numbers
                int[] numbers = {45, 12, 89, 34, 7, 56};

                // Assume the first element is the max and min initially
                int max = numbers[0];
                int min = numbers[0];

                // Loop through the array starting from the second element
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i]; // Update max if a larger value is found
                    }
                    if (numbers[i] < min) {
                        min = numbers[i]; // Update min if a smaller value is found
                    }
                }

                // Print the results
                System.out.println("Array: [45, 12, 89, 34, 7, 56]");
                System.out.println("Maximum Value: " + max); // Output: 89
                System.out.println("Minimum Value: " + min); // Output: 7
            }
        }