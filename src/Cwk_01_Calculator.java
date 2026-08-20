/*
 * Experiment 1: Programs on Operators, Arithmetic Promotion, and Method Calling
 * DBATU - OOP in Java Laboratory
 */
public class Cwk_01_Calculator {

    // Method to demonstrate method calling
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        // ---- Arithmetic Operators ----
        int a = 15, b = 4;
        System.out.println("---- Arithmetic Operators ----");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division
        System.out.println("a % b = " + (a % b));

        // ---- Relational Operators ----
        System.out.println("\n---- Relational Operators ----");
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        // ---- Logical Operators ----
        boolean x = true, y = false;
        System.out.println("\n---- Logical Operators ----");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // ---- Bitwise Operators ----
        System.out.println("\n---- Bitwise Operators ----");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));

        // ---- Arithmetic Promotion ----
        // byte/short/char automatically promoted to int during arithmetic
        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2;   // result of byte+byte is promoted to int
        System.out.println("\n---- Arithmetic Promotion ----");
        System.out.println("byte + byte -> int result = " + result);

        char c1 = 'A';   // 65
        int c1AsInt = c1 + 1;  // char promoted to int
        System.out.println("char 'A' + 1 (promoted to int) = " + c1AsInt);

        long lresult = 10 * 1000000000L;  // int promoted to long
        System.out.println("int * long -> long result = " + lresult);

        double dresult = 5 / 2;      // int/int -> int (no promotion yet)
        double dresult2 = 5 / 2.0;   // int promoted to double
        System.out.println("5/2 = " + dresult + " , 5/2.0 = " + dresult2);

        // ---- Method Calling ----
        System.out.println("\n---- Method Calling ----");
        int num = 7;
        System.out.println("Square of " + num + " = " + square(num));
    }
}