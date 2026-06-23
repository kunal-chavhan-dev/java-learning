public class Cwk_08_RightTriangle {
        public static void main(String[] args) {
            int n = 5;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println(" --- DIFFERENT PATTERN --");


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println(" --- COMBINE TRIANGLE--- ");


                    // Part 1: Increasing Triangle (1 to 5)
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }

                    // Part 2: Decreasing Triangle (4 to 1)
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }

            }


        }


