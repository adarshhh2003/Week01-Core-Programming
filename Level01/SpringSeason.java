import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Check if it's a Spring Season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                           (month == 4 && day >= 1 && day <= 30) ||
                           (month == 5 && day >= 1 && day <= 31) ||
                           (month == 6 && day >= 1 && day <= 20);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the scanner
        scanner.close();
    }
}
