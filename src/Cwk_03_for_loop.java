package com.company;
public class Cwk_03_for_loop {
    public static void main(String[] args) {
        //TASK 1: FIRST n NATURSL NUMBER//
        System.out.println("--- TASK 1; NATURAL n NATURAL NUMBER( 1 to 20 )---");
        int n = 20;
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("/n"); // MOVE TO NEXT LINE


        //TASK 2: PRINT THE NUMBER FROM 1 TO 20// ( Ascending order )
        System.out.println("--- TASK 2: NORMAL COUNTING( 1 TO 20 )---");
        for(int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("/n");


        //TASK 3: PRINT THE NUMBER FROM 20 TO 1// ( Descending Order )
        System.out.println(" TASK 2: REVERSE COUNTING( 20 TO 1 )---");
        for( int i = 20; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("/n");


        //TASK 4: STANDARD MULTIPLICATION TABLE OF 5//( MY LOGIC )
        System.out.println("--- TASK 4: TABLE OF 5 ( USING i += 5 )");
        for( int i = 5; i<= 50; i+=5 ) {
            System.out.println(i);
        }
    }
}