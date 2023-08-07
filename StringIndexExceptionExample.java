package exceptionhandling.com;

public class StringIndexExceptionExample {



    public static void main(String[] args) {
        String text = "Hello, World!";

        try {
            // Trying to access an index that is out of bounds for the string
            char character = text.charAt(20);
            System.out.println("Character at index 20: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds: " + e.getMessage());
        }
    }
}