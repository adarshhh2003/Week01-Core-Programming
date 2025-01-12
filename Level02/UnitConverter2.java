public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0; // Conversion factor
        return yards * yards2feet; // Perform conversion and return the result
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards; // Perform conversion and return the result
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches; // Perform conversion and return the result
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters; // Perform conversion and return the result
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm; // Perform conversion and return the result
    }

    // Main method to test the UnitConverter utility class
    public static void main(String[] args) {
        // Test the conversions
        double yards = 5.0;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        feet = 15.0;
        yards = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yards + " yards.");

        double meters = 2.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        inches = 78.74;
        meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        inches = 12.0;
        double centimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }
}
