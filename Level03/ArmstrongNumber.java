import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int originalNumber = number;  // Store the original number for comparison later
        int sum = 0;  // Variable to store the sum of cubes of digits

        // Use a while loop to process each digit of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            sum += Math.pow(digit, 3);  // Cube the digit and add it to the sum

            number /= 10;  // Remove the last digit from the number
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
