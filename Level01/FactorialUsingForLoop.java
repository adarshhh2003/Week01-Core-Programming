import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
		// Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check if the input is a positive integer
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            // Initialize variable for factorial computation
            long factorial = 1; // Use long to handle large results

            // Compute factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i; // Multiply the current value of i
            }

            // Print the result
            System.out.println("The factorial of natural number " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
