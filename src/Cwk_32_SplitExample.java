public class Cwk_32_SplitExample {
        public static void main(String[] args) {
            String csvData = "Apple,Banana,Orange,Mango";

            // Split by the comma
            String[] fruits = csvData.split(",");

            for (String fruit : fruits) {
                System.out.println("Fruit found: " + fruit.trim());
            }
        }

}
