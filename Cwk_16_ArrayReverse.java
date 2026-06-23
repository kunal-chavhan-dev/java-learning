public class Cwk_16_ArrayReverse {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Original: ");
            printArray(arr);

            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            System.out.print("Reversed: ");
            printArray(arr);
        }

        static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

}
