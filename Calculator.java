import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your first integer: ");
        int x = scan.nextInt();

        System.out.print("Input your second integer: ");
        int y = scan.nextInt();

        System.out.print("Result of Addition: " + (x + y));
    }
}