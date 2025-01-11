import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner
        scanner.close();
    }
}