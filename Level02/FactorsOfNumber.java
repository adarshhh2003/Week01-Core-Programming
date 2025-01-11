import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find the factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);  // Print the factor
            }
        }

        // Close the scanner
        scanner.close();
    }
}
