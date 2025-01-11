import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Displaying a message to the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner
        scanner.close();
    }
}