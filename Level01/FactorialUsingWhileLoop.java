import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check if the input is a positive integer
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            // Initialize variables for factorial computation
            long factorial = 1; // Use long to handle large results
            int i = 1;

            // Compute factorial using a while loop
            while (i <= num) {
                factorial *= i; // Multiply the current value of i
                i++; // Increment i
            }

            // Print the result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
