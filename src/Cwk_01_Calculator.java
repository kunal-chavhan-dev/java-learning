import java.util.Scanner;
class Cwk_01_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second Number:");
        double num2 = sc.nextDouble();

        System.out.println("Operators(+, - , *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error!Cannot Divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }

    }
}
