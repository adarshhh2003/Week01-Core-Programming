import java.util.Scanner;
import java.util.Arrays;

public class FindFactors {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Display a message to the user for a number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array needs resizing
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of maxFactor
                    factors = Arrays.copyOf(factors, maxFactor); // Resize the array
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Close the Scanner
        input.close();
    }
}
