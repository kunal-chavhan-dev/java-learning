package com.myprojects.patterns;
public class Cwk_06_DiamondPattern {
        public static void main(String[] args) {
            int n = 5;

            // Upper Part of the Diamond
            for (int i = 1; i <= n; i++) {
                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                // Move to the next line
                System.out.println();
            }

            // Lower Part of the Diamond
            for (int i = n - 1; i >= 1; i--) {
                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

}
