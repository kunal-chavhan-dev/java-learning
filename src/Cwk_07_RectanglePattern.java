package com.myprojects.patterns;
public class Cwk_07_RectanglePattern {
        public static void main(String[] args) {
            int m = 5;
            int n = 5;

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    // Check if it's the boundary
                    if (i == 1 || i == m || j == 1 || j == n) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

}
