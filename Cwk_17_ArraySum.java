public class Cwk_17_ArraySum {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }

            System.out.println("Array: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println();
            System.out.println("Sum = " + sum);
        }

}
