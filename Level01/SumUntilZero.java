import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Variable to store user input
        double number;

        // Display a message to the user to enter numbers until 0
        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Loop until the user enters 0
        while (true) {
            number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }

        // Display the total
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}