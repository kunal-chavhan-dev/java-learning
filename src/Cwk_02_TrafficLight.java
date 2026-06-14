import java.util.Scanner;

public class Cwk_02_TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter button (1 for RED, 2 for YELLOW, 3 for GREEN): ");
        int button = sc.nextInt();

        // CONDITION START
        if (button == 1) {
            System.out.println("Stop! The light is RED");
        }
        else if (button == 2) {
            System.out.println("Wait! The light is YELLOW");
        }
        else if (button == 3) {
            System.out.println("Go! The light is GREEN");
        }
        else {
            System.out.println("Invalid Button");
        }

    }
}
