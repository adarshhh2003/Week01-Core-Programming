import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
		// Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i; // Add current number to the total sum
            }

            // Compare and display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

            if (formulaSum == forSum) {
                System.out.println("Both computations are correct and give the same result.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }

        scanner.close();
    }
}
