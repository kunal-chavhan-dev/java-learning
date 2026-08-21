public class Cwk_35_StringExamples {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Java");

            sb.append(" Programming");      // add at end
            System.out.println(sb);          // Java Programming

            sb.insert(4, " Core");           // insert at index
            System.out.println(sb);          // Java Core Programming

            sb.replace(0, 4, "Core");        // replace part
            System.out.println(sb);          // Core Core Programming

            sb.delete(0, 5);                 // delete part
            System.out.println(sb);          // Core Programming

            System.out.println("Length: " + sb.length());
        }
    
}
