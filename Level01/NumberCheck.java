import java.util.Scanner;

public class NumberCheck {

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero using the method
        int result = checkNumber(number);

        // Display the result to the user
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner object to free resources
        scanner.close();
    }
}
