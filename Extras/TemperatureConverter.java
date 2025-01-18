import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to get user input
    public static double getInput(String temperatureType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in " + temperatureType + ": ");
        return scanner.nextDouble();
    }

    // Method to display the output
    public static void displayOutput(double inputTemperature, double convertedTemperature, String inputUnit, String outputUnit) {
        System.out.println(inputTemperature + " " + inputUnit + " is equal to " + convertedTemperature + " " + outputUnit);
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        // Get temperature in Fahrenheit and convert to Celsius
        double fahrenheit = getInput("Fahrenheit");
        double celsius = fahrenheitToCelsius(fahrenheit);
        displayOutput(fahrenheit, celsius, "Fahrenheit", "Celsius");

        // Get temperature in Celsius and convert to Fahrenheit
        double celsiusInput = getInput("Celsius");
        double fahrenheitConverted = celsiusToFahrenheit(celsiusInput);
        displayOutput(celsiusInput, fahrenheitConverted, "Celsius", "Fahrenheit");
    }
}
