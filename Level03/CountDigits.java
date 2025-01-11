import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count to 0
        int count = 0;

        // Handle the case for 0 since 0 has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Use a loop to count digits
            while (number != 0) {
                number /= 10;  // Remove the last digit from number
                count++;       // Increment the count
            }
        }

        // Output: Display the number of digits
        System.out.println("The number has " + count + " digits.");

        scanner.close();
    }
}
