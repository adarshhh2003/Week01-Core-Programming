import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
		// Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; // Initialize the total to 0.0
		
		// Display a message to the user
        System.out.println("Enter numbers to add to the total. Enter 0 or a negative number to stop.");

		// Loop until the user enter zero or negative number
        while (true) {
            System.out.print("Enter a number: ");
            double userInput = scanner.nextDouble(); // Get user input

            if (userInput <= 0) { // Exit condition
                break;
            }

            total += userInput; // Add the input to the total
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
