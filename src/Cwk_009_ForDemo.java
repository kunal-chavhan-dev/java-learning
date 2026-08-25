public class Cwk_009_ForDemo {
    public static void main(String[] args) {
        int [] [] flats = new int [2] [3];
        int n = flats.length;
        flats [0] [0] = 101;
        flats [0] [1] = 102;
        flats [0] [2] = 103;
        flats [1] [0] = 201;
        flats [1] [1] = 202;
        flats [1] [2] = 203;

        for( int i = 0; i < n; i++) {
            for( int j = 0; j < flats[i].length; j++) {
                System.out.print(flats [i] [j]+ " ");

            }
            System.out.println();
        }
    }
}