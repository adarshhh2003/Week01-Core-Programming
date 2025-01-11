import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit the program
        }

        // Calculate the maximum size of odd and even arrays
        int size = number / 2 + 1;

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Initialize indices for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Save even number
            } else {
                oddNumbers[oddIndex++] = i; // Save odd number
            }
        }

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the Scanner
        input.close();
    }
}