public class Cwk_007_LarSmaDemo {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int max = arr[0];
        int min = arr[0];
        int n = arr.length;
        arr[5] = 90;

        // max & min value printig
        for( int i = 0; i < n; i++) {
            if( arr[i] > max ) max = arr[i];
            if( arr[i] < min ) min = arr[i];
        }

        System.out.println(" max =" + max);
        System.out.println(" min =" + min);
    }
}
