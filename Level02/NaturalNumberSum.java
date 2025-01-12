import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; // Base case: Sum of the first natural number is 1
        }
        return n + sumUsingRecursion(n - 1); // Recursive case: n + sum of (n-1)
    }

    // Method to calculate the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2; // Formula to calculate the sum of the first n natural numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("The entered number is not a natural number. Please enter a positive integer.");
        } else {
            // Calculate the sum using recursion
            int recursiveSum = sumUsingRecursion(n);

            // Calculate the sum using the formula
            int formulaSum = sumUsingFormula(n);

            // Print the results
            System.out.println("Sum of the first " + n + " natural numbers using recursion: " + recursiveSum);
            System.out.println("Sum of the first " + n + " natural numbers using the formula: " + formulaSum);

            // Compare the results
            if (recursiveSum == formulaSum) {
                System.out.println("Both computations are correct and yield the same result.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
