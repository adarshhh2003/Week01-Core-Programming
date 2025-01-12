import java.util.Scanner;

public class AthleteRun {

    // Method to calculate the number of rounds needed to complete a given distance
    public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3; // Calculate the perimeter of the triangular park
        return totalDistance / perimeter; // Calculate the number of rounds
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the length of the first side of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Total distance the athlete wants to run (in meters)
        double totalDistance = 5000;

        // Calculate the number of rounds using the method
        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        // Display the result to the user
        System.out.println("To complete a 5 km run, the athlete needs to complete " + Math.ceil(rounds) + " rounds of the park.");

        // Close the Scanner object to free resources
        scanner.close();
    }
}
