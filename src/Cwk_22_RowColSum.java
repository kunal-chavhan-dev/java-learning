public class Cwk_22_RowColSum {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Row sum
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;
                for (int j = 0; j < 3; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Row " + i + " sum = " + rowSum);
            }

            // Column sum
            for (int j = 0; j < 3; j++) {
                int colSum = 0;
                for (int i = 0; i < 3; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Col " + j + " sum = " + colSum);
            }
        }

}
