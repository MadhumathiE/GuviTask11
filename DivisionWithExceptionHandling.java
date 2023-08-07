package exceptionhandling.com;
import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int denominator = scanner.nextInt();

        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static double divideNumbers(int numerator, int denominator) {
        return (double) numerator / denominator;
    }
}
