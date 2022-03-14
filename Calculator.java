import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your first integer: ");
        int x = scan.nextInt();

        System.out.print("Input your second integer: ");
        int y = scan.nextInt();

        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("--------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println();

        System.out.print("Select an option: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result of Addition: " + (x + y));
                break;
            case 2:
                System.out.println("Result of Subtraction: " + (x - y));
                break;
            default:
                System.out.println("There was an error with your selection");
                break;
        }
    }
}