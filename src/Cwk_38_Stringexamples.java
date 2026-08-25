public class Cwk_38_Stringexamples {
        public static void main(String[] args) {
            String str1 = "12345";
            String str2 = "Hello123";
            String str3 = "HelloWorld";

            System.out.println(str1.matches("[0-9]+"));       // true - only digits
            System.out.println(str2.matches("[a-zA-Z0-9]+"));  // true - alphanumeric
            System.out.println(str3.matches("[a-zA-Z]+"));     // true - only letters

            // Check if string starts/ends with something
            String fileName = "assignment.pdf";
            System.out.println(fileName.startsWith("assignment"));  // true
            System.out.println(fileName.endsWith(".pdf"));          // true
        }

}
