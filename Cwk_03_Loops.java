package com.company;

public class Cwk_03_Loops {
    public static void main(String[] args) {

        // TASK 1: FIRST 20 NATURAL NUMBERS
        System.out.println("--- TASK 1: FIRST 20 NATURAL NUMBERS ---");
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


        System.out.println("\n");


        // TASK 2: PRINT THE NUMBER FROM 1 TO 20
        System.out.println("--- TASK 2: NORMAL COUNTING (1 TO 20) ---");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }


        System.out.println("\n");


        // TASK 3: PRINT THE NUMBER FROM 20 TO 1
        System.out.println("--- TASK 3: REVERSE COUNTING (20 TO 1) ---");
        for (int i = 20; i >= 1; i--) {
            System.out.println(i);
        }


        System.out.println("\n");


        // TASK 4: TABLE OF 5
        System.out.println("--- TASK 4: MULTIPLICATION TABLE OF 5 ---");
        for (int i = 5; i <= 50; i+=5) {
            System.out.println(i);
        }
    }
}
