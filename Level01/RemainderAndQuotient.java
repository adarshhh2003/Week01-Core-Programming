import java.util.Scanner;

public class RemainderAndQuotient {

    // Method to find the remainder and quotient of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Division operator for quotient
        int remainder = number % divisor; // Modulus operator for remainder

        // Return quotient and remainder as an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to avoid division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed. Please enter a valid divisor.");
        } else {
            // Call the method and get the result
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        scanner.close();
    }
}
