import java.util.*;
public class Cwk_05_PatternPrinting {

    // 1. Filled Rectangle
    public static void printFilledRectangle(int rows, int cols) {
        System.out.println("--- Filled Rectangle ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 2. Right-Angled Triangle
    public static void printRightTriangle(int n) {
        System.out.println("\n--- Right-Angled Triangle ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 3. Inverted Right-Angled Triangle
    public static void printInvertedTriangle(int n) {
        System.out.println("\n--- Inverted Right-Angled Triangle ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 4. Hollow Rectangle
    public static void printHollowRectangle(int rows, int cols) {
        System.out.println("\n--- Hollow Rectangle ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    // 5. Pyramid
    public static void printPyramid(int n) {
        System.out.println("\n--- Pyramid ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }


    // 6. Diamond
    public static void printDiamond(int n) {
        System.out.println("\n--- Diamond ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // You can change these numbers to adjust the size of your patterns
        int n = 5;

        printFilledRectangle(4, 5);
        printRightTriangle(n);
        printInvertedTriangle(n);
        printHollowRectangle(4, 5);
        printPyramid(n);
        printDiamond(4);
    }
}