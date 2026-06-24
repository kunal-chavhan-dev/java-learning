public class Cwk_19_RemoveDuplicates {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 2, 3, 4, 4, 5};

            System.out.print("Without duplicates: ");
            for (int i = 0; i < numbers.length; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[i] == numbers[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }

}
