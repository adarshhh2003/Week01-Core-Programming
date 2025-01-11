import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit 
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner
        scanner.close();
    }
}