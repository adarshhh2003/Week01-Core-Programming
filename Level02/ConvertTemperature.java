import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner
        scanner.close();
    }
}