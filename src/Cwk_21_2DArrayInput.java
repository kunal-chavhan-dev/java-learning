import java.util.Scanner;

    public class Cwk_21_2DArrayInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[3][3];

            // Input
            System.out.println("Enter 9 elements:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Print
            System.out.println("Your Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

