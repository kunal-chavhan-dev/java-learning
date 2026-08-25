public class Cwk_005_ArrayExp {
    public static void main(String[] args) {
       /* double marks [] = {20.3, 40.6,40.7,50.9,44.6};
        double  sum = 0;

        for( double element: marks) {
            sum = sum + element;

        }
        System.out.println("sum =" + sum);*/

        double marks [] = {20.3, 40.6,40.7,50.9,44.6};
        double num = 40.6;
        boolean isInArray = false;

        for( double element: marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println(" the number is avialable");

        } else {
            System.out.println(" the number is not avialable");
        }
    }
}
