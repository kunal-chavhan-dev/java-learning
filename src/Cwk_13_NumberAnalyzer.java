import java.util.Scanner;

public class Cwk_13_NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if number is prime
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Check if number is even or odd
        String parity = (number % 2 == 0) ? "Even" : "Odd";

        // Calculate factorial (only for small non-negative numbers)
        long factorial = 1;
        if (number >= 0 && number <= 15) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }

        // Check if number is a perfect square
        boolean isPerfectSquare = false;
        for (int i = 0; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        // Print results
        System.out.println("\n--- Analysis of " + number + " ---");
        System.out.println("Parity: " + parity);
        System.out.println("Is Prime: " + isPrime);
        System.out.println("Is Perfect Square: " + isPerfectSquare);

        if (number >= 0 && number <= 15) {
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Factorial: Skipped (number out of safe range)");
        }

        scanner.close();
    }
}