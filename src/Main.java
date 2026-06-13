import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //LEAP YEAR CHECKER//
        if( year % 4 == 0) {
            System.out.println("It is a leap Year!");
        }
        else {
            System.out.println("Not a leap Year!");
        }
    }
}