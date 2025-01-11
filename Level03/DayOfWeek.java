import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Input: Get month, day, and year from command line arguments
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        // Step 1: Apply the given formulas

        // Calculate y0 (year adjusted for leap years)
        int y0 = y - (14 - m) / 12;
        
        // Calculate x (adjustment for leap year and century rules)
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // Calculate m0 (adjusted month)
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // Calculate d0 (final day of week index)
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Output: Print the day of the week (0 - Sunday, 1 - Monday, ..., 6 - Saturday)
        System.out.println("The day of the week is: " + d0);
        
        scanner.close();
    }
}
