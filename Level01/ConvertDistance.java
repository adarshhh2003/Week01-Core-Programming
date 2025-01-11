import java.util.Scanner;

public class ConvertDistance {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Displaying a message to the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the result
        System.out.println("The distance in feet is " + distanceInFeet + ", which is equal to " + distanceInYards + " yards and " + distanceInMiles + " miles.");

        // Close the scanner
        scanner.close();
    }
}
