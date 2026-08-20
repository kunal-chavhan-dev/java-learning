import java.util.*;
public class Cwk_009_ForDemo {
    public static void main(String[] args) {

        int marks [] = { 20,30,40,50,60,70};
        int n = marks.length;
        // updating number
        marks[5] = 90;

        // element printing
        System.out.println("-- PRINTING ELEMENT--");
        System.out.println(marks[4] + " ");


       // forward counting number
        System.out.println("-- FORWARD COUNTING --");
        for( int i = 0; i < n; i++) {
            System.out.println( marks[i] + " ");

        }

        // reverse counting number
        System.out.println("-- REVERSE COUNTING --");
        for( int i = n -1; i >= 0; i--) {
            System.out.println(marks[i] + " ");
        }
    }

}
