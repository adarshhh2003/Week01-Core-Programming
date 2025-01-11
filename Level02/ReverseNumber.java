import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Find the count of digits in the number
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }

        int[] digits = new int[digitCount];

        // Extract digits and store them in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

        scanner.close();
    }
}
