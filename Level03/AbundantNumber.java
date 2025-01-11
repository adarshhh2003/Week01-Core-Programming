import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum of divisors to 0
        int sum = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        scanner.close();
    }
}
