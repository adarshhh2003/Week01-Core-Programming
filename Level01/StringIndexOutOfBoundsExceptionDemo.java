import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Generating StringIndexOutOfBoundsException:");
        // Attempting to access a character beyond the length of the string
        System.out.println("Character at index 100: " + text.charAt(100)); // This will throw the exception
    }

    // Method to handle StringIndexOutOfBoundsException using a try-catch block
    public static void handleException(String text) {
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        try {
            // Attempt to access a character beyond the length of the string
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Catch and handle the exception
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        // Demonstrate the exception generation
		
		/*
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception to prevent program termination
            System.out.println("Caught exception in main: " + e.getMessage());
        }
		*/
		
        // generateException(userInput);
        // Demonstrate safe handling of the exception
        handleException(userInput);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
