public class Cwk_007_LarSmaDemo {
    public static void main(String[] args) {
        int arr[] = {20,30,50,60,70,66};
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) max = arr[i];
                    if(arr[i] < min ) min = arr[i];
        }
        System.out.println("max = " + max );
        System.out.println("min = " + min);

    }
}