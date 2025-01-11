import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the base number and power from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result to 1
        int result = 1;

        // Loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number in each iteration
        }

        // Output: Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
