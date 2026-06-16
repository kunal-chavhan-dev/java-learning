import java.util.*;
public class Cwk_05_PatternPrinting {
    public static void main(String[] arggs) {
        int n = 4;

        // Upper part
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }

    }
}

