import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Display a message to the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");

        // Close the scanner
        scanner.close();
    }
}