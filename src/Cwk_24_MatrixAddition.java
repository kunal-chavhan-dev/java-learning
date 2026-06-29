 import java.util.Scanner;

    public class Cwk_24_MatrixAddition {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] a = new int[3][3];
            int[][] b = new int[3][3];
            int[][] result = new int[3][3];

            // Matrix A input
            System.out.println("Enter Matrix A (9 elements):");
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    a[i][j] = sc.nextInt();

            // Matrix B input
            System.out.println("Enter Matrix B (9 elements):");
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    b[i][j] = sc.nextInt();

            // Addition
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    result[i][j] = a[i][j] + b[i][j];

            // Print result
            System.out.println("Result Matrix (A + B):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(result[i][j] + " ");
                System.out.println();
            }
        }
    }

