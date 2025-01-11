import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long originalNumber = number; // Store the original number for display

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Frequency array to store the count of each digit (0-9)
        int[] frequency = new int[10];

        // Find the frequency of each digit
        while (number > 0) {
            int digit = (int) (number % 10); // Extract the last digit
            frequency[digit]++;
            number /= 10; // Remove the last digit
        }

        // Display the original number
        System.out.println("The number is: " + originalNumber);

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
