import java.util.Scanner;

public class EricTravel {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get user inputs for name and cities
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = scanner.nextLine();

        // Get distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Get time taken in hours and minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours): ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int minutes1 = scanner.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours): ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int minutes2 = scanner.nextInt();

        // Calculate total distance and time
        double totalDistance = fromToVia + viaToFinalCity;
        int totalHours = hours1 + hours2;
        int totalMinutes = minutes1 + minutes2;

        // Adjust total time if minutes exceed 60
        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes = totalMinutes % 60;
        }

        // Display the result
        System.out.println("\nTraveler: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalHours + " hours and " + totalMinutes + " minutes");

        // Close the scanner
        scanner.close();
    }
}