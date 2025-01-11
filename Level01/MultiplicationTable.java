import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
		// Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Generate multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

		// Close the scanner object
        scanner.close();
    }
}
