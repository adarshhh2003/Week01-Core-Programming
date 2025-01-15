import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(int[] arr) {
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        int result = arr[10]; // Invalid text input
		System.out.println("Result:" + result); // This line will not execute
    }

    // Method to handle ArrayIndexOutOfBoundsException using a try-catch block
    public static void handleException(int[] arr) {
        try {
			System.out.println("Attempting to handle the exception");
			int result = arr[10];	// Invalid text input
			System.out.println("Result:" + result); // This line will not execute
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
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

		int[] arr = new int[5];
		
        // Prompt the user for a string
        System.out.println("Enter five numbers:");
		for(int i=0; i<5; i++) {
			arr[i] = scanner.nextInt();
		}
		
        // Demonstrate the exception generation
		try {
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception to prevent program termination
            System.out.println("Caught exception in main: " + e.getMessage());
        }
		
		
        // generateException(arr);
        // Demonstrate safe handling of the exception
        handleException(arr);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}