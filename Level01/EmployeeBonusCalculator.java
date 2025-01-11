import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
		// Create a scanner object to read the input from the user
        Scanner scanner = new Scanner(System.in);

        // Take salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check years of service and calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // Calculate 5% bonus
            System.out.println("The employee is eligible for a bonus of: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        scanner.close();
    }
}
