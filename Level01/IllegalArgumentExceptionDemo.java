import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException:");
        String result = text.substring(5, 3); // Invalid start and end index
		System.out.println("Result:" + result); // This line will not execute
    }

    // Method to handle IllegalArgumentException using a try-catch block
    public static void handleException(String text) {
        try {
			System.out.println("Attempting to handle the exception");
			String result = text.substring(5, 3);	// Invalid start and end index
			System.out.println("Result:" + result); // This line will not execute
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Caught RuntimeException: " + e.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        // Demonstrate the exception generation
		
		
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            // Catch the exception to prevent program termination
            System.out.println("Caught exception in main: " + e.getMessage());
        }
		
		
        // generateException(userInput);
        // Demonstrate safe handling of the exception
        handleException(userInput);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}