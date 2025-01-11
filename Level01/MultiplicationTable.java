import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Declare an array to store the multiplication results
        int[] multiplicationResult = new int[4]; // For 6, 7, 8, 9

        // Compute the multiplication table for numbers 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = 6 + i; // Calculate the multiplier (6 to 9)
            multiplicationResult[i] = number * multiplier;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = 6 + i;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        // Close the Scanner
        input.close();
    }
}