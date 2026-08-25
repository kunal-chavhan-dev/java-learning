import java.util.*;
public class Cwk_008_ArrayDemo {
    public static void main(String[] args) {

        int mat1 [] [] = {{2, 4, 5,},
                { 4,5,6}};
        int mat2 [] [] = {{4,5,6},
                {4,5,6} };
        int result [] [] = {{0,0,0},
                {0,0,0} };

        for( int i = 0; i < mat1.length;i++) {
            for( int j = 0; j < mat1[i].length;j++) {
                result [i] [j] =  mat1 [i] [j] + mat2 [i] [j];
                System.out.printf( result [i] [j] + " ");
            }
            System.out.println( " ");
        }
    }
}
