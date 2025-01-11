import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get an integer from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the greatestFactor to 1
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Output: Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        scanner.close();
    }
}
