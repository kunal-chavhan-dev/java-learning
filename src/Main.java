import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // CONDITION START
        if(button == 1) {
            System.out.println("Stop! The light is RED");
        }
        else if(button == 2 ) {
            System.out.println("Wait! The light is YELLOW");
        }
        else if(button == 3 ) {
            System.out.println("Go! The light is GREEN");
        }
        else{
            System.out.println("Invalid Button");
        }
    }
}