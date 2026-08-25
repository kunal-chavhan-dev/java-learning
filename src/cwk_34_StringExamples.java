import java.util.Arrays;

public class cwk_34_StringExamples {
        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println(s1 + " and " + s2 + " are Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

}
