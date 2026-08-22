public class Cwk_37_stringExamples {
        public static void main(String[] args) {
            String numStr = "123";
            String invalidStr = "abc";

            // Valid conversion
            int num = Integer.parseInt(numStr);
            System.out.println("Converted: " + (num + 10));

            // Invalid conversion - exception handle karna
            try {
                int invalid = Integer.parseInt(invalidStr);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + invalidStr + "' ek valid number nahi hai");
            }

            // Number ko wapas String me
            int x = 456;
            String backToStr = String.valueOf(x);
            System.out.println("String hai ye: " + backToStr);
        }
    
}
