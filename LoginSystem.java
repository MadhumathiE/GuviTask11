package exceptionhandling.com;
import java.util.Scanner;
public class LoginSystem {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "password123";  // Replace this with the actual correct password

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (authenticateUser(username, enteredPassword, correctPassword)) {
                System.out.println("Login successful!");
            } else {
                throw new AuthenticationException("Incorrect password");
            }
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }

        scanner.close();
    }

    public static boolean authenticateUser(String username, String enteredPassword, String correctPassword) {
        // In a real system, you would perform proper authentication logic here
        return correctPassword.equals(enteredPassword);
    }
}

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}