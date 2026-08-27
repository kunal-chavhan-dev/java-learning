public class Cwk_42_StringSearchExample {
        public static void main(String[] args) {
            String sentence = "Java Programming Language";


            // 1. Substring nikalna
            System.out.println("Substring: " + sentence.substring(5, 16)); // Output: Programming

            // 2. Check karna ki string kis se start ya end hoti hai
            System.out.println("Starts with Java: " + sentence.startsWith("Java")); // Output: true

            // 3. Index of a character
            System.out.println("Index of 'a': " + sentence.indexOf('a')); // Output: 1
        }

}