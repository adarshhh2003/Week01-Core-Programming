import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Create a String array to store the results
            String[] results = new String[number + 1];

            // Loop from 0 to the number and apply FizzBuzz logic
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";  // Multiple of both 3 and 5
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";  // Multiple of 3
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";  // Multiple of 5
                } else {
                    results[i] = Integer.toString(i);  // Other numbers
                }
            }

            // Loop through the array and print the results
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
