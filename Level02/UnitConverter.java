public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371; // Conversion factor
        return km * km2miles; // Perform conversion and return the result
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934; // Conversion factor
        return miles * miles2km; // Perform conversion and return the result
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; // Conversion factor
        return meters * meters2feet; // Perform conversion and return the result
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; // Conversion factor
        return feet * feet2meters; // Perform conversion and return the result
    }

    // Main method to test the UnitConverter utility class
    public static void main(String[] args) {
        // Test the conversions
        double km = 10.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        miles = 6.2;
        double kilometers = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        double meters = 100.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        feet = 328.084;
        meters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}
