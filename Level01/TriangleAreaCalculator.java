import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Displaying a message to the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * baseInches * heightInches;

        // Convert area to square centimeters (1 inch = 2.54 cm, so 1 square inch = 6.4516 square cm)
        double areaInCm = areaInInches * 6.4516;

        // Display the results
        System.out.println("The base of the triangle is " + baseInches + " inches and the height is " + heightInches + " inches.");
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");

        // Close the scanner
        scanner.close();
    }
}