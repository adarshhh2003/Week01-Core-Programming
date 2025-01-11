import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a number from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Prime check: Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else {
            boolean isPrime = true;  // Assume the number is prime initially

            // Loop through all numbers from 2 to the number-1
            for (int i = 2; i <= number / 2; i++) {
                // Check if the number is divisible by any number between 2 and number/2
                if (number % i == 0) {
                    isPrime = false;  // Set isPrime to false if divisible
                    break;  // No need to check further, as we already know the number is not prime
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }

        scanner.close();
    }
}
