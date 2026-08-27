public class Cwk_44_StringConversionExample {
        public static void main(String[] args) {
            String sentence = "Java Programming Language";

            // 1. String ko uppercase mein convert karna
            System.out.println("Uppercase: " + sentence.toUpperCase());

            // 2. String ko lowercase mein convert karna
            System.out.println("Lowercase: " + sentence.toLowerCase());

            // 3. String ko trim karna (extra spaces hatana)
            String withSpaces = "   Hello Kunal   ";
            System.out.println("Trimmed: '" + withSpaces.trim() + "'");

            // 4. String ko reverse karna (StringBuilder use karke)
            String reversed = new StringBuilder(sentence).reverse().toString();
            System.out.println("Reversed: " + reversed);
        }

}
