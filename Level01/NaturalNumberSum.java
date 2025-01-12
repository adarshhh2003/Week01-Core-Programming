import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of n natural numbers
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 'n'
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Create an instance of the class to call the non-static method
            NaturalNumberSum naturalNumberSum = new NaturalNumberSum();

            // Calculate the sum
            int sum = naturalNumberSum.calculateSum(n);

            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
