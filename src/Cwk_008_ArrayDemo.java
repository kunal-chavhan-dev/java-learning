import java.util.*;
public class Cwk_008_ArrayDemo {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 30, 40, 50};
        int sum = 0;
        int n = arr.length;

        for( int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / n;
        System.out.println("sum =" + sum );
        System.out.printf( "Average = %.2f%n",avg);
    }
}
