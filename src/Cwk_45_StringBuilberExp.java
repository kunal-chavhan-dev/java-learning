public class Cwk_45_StringBuilberExp {
        public static void main(String[] args) {
            String str = "madam";

            StringBuilder sb = new StringBuilder(str);
            StringBuilder reversed = new StringBuilder(str).reverse();

            if (sb.toString().equals(reversed.toString())) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is NOT a Palindrome");
            }
        }
}
