public class Cwk_20_SecondLargest {
        public static void main(String[] args) {
            int[] numbers = {10, 45, 23, 89, 12, 67};

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > first) {
                    second = first;
                    first = numbers[i];
                } else if (numbers[i] > second && numbers[i] != first) {
                    second = numbers[i];
                }
            }

            System.out.println("Largest = " + first);
            System.out.println("Second Largest = " + second);
        }

}
