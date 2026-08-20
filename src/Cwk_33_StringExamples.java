public class Cwk_33_StringExamples {
        public static void main(String[] args) {

            // 1. String creation
            String s1 = "Hello";                  // literal (string pool)
            String s2 = new String("Hello");      // new object (heap)

            // 2. Concatenation
            String s3 = s1 + " World";            // "Hello World"
            String s4 = s1.concat(" Java");       // "Hello Java"

            // 3. Length
            System.out.println(s1.length());      // 5

            // 4. charAt
            System.out.println(s1.charAt(1));     // 'e'

            // 5. substring
            System.out.println(s3.substring(6));       // "World"
            System.out.println(s3.substring(0, 5));    // "Hello"

            // 6. indexOf / lastIndexOf
            System.out.println(s3.indexOf("o"));       // 4
            System.out.println(s3.lastIndexOf("o"));   // 7

            // 7. equals vs ==
            System.out.println(s1 == s2);          // false (different objects)
            System.out.println(s1.equals(s2));     // true (same content)

            // 8. equalsIgnoreCase
            System.out.println("HELLO".equalsIgnoreCase(s1)); // true

            // 9. toUpperCase / toLowerCase
            System.out.println(s1.toUpperCase());  // "HELLO"
            System.out.println(s1.toLowerCase());  // "hello"

            // 10. trim (removes leading/trailing spaces)
            String s5 = "   spaced out   ";
            System.out.println(s5.trim());         // "spaced out"

            // 11. replace
            System.out.println(s1.replace('l', 'p')); // "Heppo"

            // 12. split
            String csv = "apple,banana,mango";
            String[] fruits = csv.split(",");
            for (String f : fruits) System.out.println(f);

            // 13. contains
            System.out.println(s3.contains("World")); // true

            // 14. startsWith / endsWith
            System.out.println(s1.startsWith("He"));   // true
            System.out.println(s1.endsWith("lo"));     // true

            // 15. compareTo
            System.out.println("apple".compareTo("banana")); // negative (a < b)

            // 16. String reverse (via StringBuilder)
            String reversed = new StringBuilder(s1).reverse().toString();
            System.out.println(reversed);          // "olleH"

            // 17. isEmpty / isBlank
            System.out.println("".isEmpty());      // true
            System.out.println("   ".isBlank());   // true

            // 18. String to char array
            char[] chars = s1.toCharArray();

            // 19. valueOf (convert other types to String)
            String numStr = String.valueOf(123);   // "123"

            // 20. format
            String formatted = String.format("Name: %s, Age: %d", "CK", 19);
            System.out.println(formatted);
        }
}
