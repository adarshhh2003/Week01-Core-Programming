import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Condition for leap year:
        // - Divisible by 4 and not divisible by 100, OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Call the method to check if it's a leap year
            boolean leapYear = isLeapYear(year);

            // Print the result
            if (leapYear) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
