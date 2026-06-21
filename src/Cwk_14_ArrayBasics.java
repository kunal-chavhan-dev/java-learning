public class Cwk_14_ArrayBasics {
        public static void main(String[] args) {
            int[] marks = {85, 92, 78, 65, 90};
            int sum = 0;

            // Traverse array using for loop
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Marks[" + i + "] = " + marks[i]);
                sum += marks[i];
            }

            double average = (double) sum / marks.length;
            System.out.println("Total Sum: " + sum);
            System.out.println("Average: " + average);
        }

}
