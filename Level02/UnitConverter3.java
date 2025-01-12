public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Conversion formula
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Conversion formula
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons;
    }

    // Main method to test the UnitConverter utility class
    public static void main(String[] args) {
        // Test temperature conversions
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
        
        celsius = 37.0;
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");

        // Test weight conversions
        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        kilograms = 68.0;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");

        // Test volume conversions
        double gallons = 10.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        liters = 37.85;
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }
}
