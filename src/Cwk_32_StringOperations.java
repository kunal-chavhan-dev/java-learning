public class Cwk_32_StringOperations {
        public static void main(String[] args) {
            String str = "Hello Java";

            // 1. Length
            System.out.println("Length: " + str.length());

            // 2. Concatenation
            String fullString = str + " Programming";
            System.out.println("Concatenated: " + fullString);

            // 3. Substring
            System.out.println("Substring: " + str.substring(6)); // Extracts "Java"

            // 4. Comparison
            String str1 = "Java";
            String str2 = "java";
            System.out.println("Equals (case sensitive): " + str1.equals(str2)); // false
            System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase(str2)); // true
        }

}
