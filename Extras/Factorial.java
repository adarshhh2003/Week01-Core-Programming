import java.util.Scanner;

public class Factorial {

    // Recursive function to calculate factorial
    public static int calculateFactorial(int number) {
        if (number == 1) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return number * calculateFactorial(number - 1);  // Recursive step
        }
    }

    // Method to get user input
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Method to display the output
    public static void displayOutput(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        int number = getInput();  // Get user input
        int factorial = calculateFactorial(number);  // Calculate factorial using recursion
        displayOutput(number, factorial);  // Display the result
    }
}
