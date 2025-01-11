import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

		// Taking input
        double heightCm = scanner.nextDouble();

        // Conversion factors
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        // Convert height to inches
        double totalInches = heightCm / cmPerInch;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;

        // Display the result
        System.out.println("Your height in cm is " + heightCm + ", while in feet is " + feet + " and inches is " + remainingInches);

        // Close the scanner
        scanner.close();
    }
}