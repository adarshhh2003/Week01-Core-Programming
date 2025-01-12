import java.util.Scanner;

public class ChocolateDivision {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Chocolates per child
        int remainder = number % divisor; // Remaining chocolates

        // Return quotient and remainder as an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero. Please enter a valid number.");
        } else {
            // Call the method and get the result
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}
