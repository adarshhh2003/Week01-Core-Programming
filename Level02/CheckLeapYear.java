import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid (Gregorian calendar starts in 1582)
        if (year < 1582) {
            System.out.println("The year must be 1582 or later. Please enter a valid year.");
        } else {
            // Single if condition using logical AND (&&) and OR (||) operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }
}
