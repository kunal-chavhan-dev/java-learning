public class Cwk_36_StringExamples {
        public static void main(String[] args) {
            String name = "Kunal";
            int age = 19;
            double marks = 87.5;

            // String.format() use
            String result = String.format("Name: %s, Age: %d, Marks: %.2f", name, age, marks);
            System.out.println(result);

            // printf() directly print
            System.out.printf("Student %s scored %.1f%% marks%n", name, marks);

            // Padding and alignment
            System.out.printf("%-10s|%5d%n", "Roll No", 101);
        }

}
