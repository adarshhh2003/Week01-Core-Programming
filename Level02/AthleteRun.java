import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the lengths of the triangle sides from the user
        System.out.print("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double totalDistance = 5000;

        // Calculate the total number of rounds required
        double rounds = totalDistance / perimeter;
		
		int result = (int)Math.ceil(rounds);
        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + result + " to complete 5 km.");

        // Close the scanner
        scanner.close();
    }
}