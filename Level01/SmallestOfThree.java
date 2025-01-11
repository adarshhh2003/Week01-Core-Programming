import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        // Close the scanner
        scanner.close();
    }
}