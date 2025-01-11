import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
		// Create a scanner class to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a positive integer
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        scanner.close();
    }
}
