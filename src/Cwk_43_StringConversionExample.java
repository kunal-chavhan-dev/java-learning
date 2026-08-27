public class Cwk_43_StringConversionExample {
        public static void main(String[] args) {
            String s1 = "Hello";

            // 1. String ko Character Array me convert karna
            char[] chars = s1.toCharArray();
            for (char c : chars) {
                System.out.print(c + " "); // Output: H e l l o
            }
            System.out.println();

            // 2. Kisi bhi type ko String me convert karna (valueOf)
            int num = 123;
            String numStr = String.valueOf(num);
            System.out.println("Converted String: " + numStr); // Output: 123
        }

}
