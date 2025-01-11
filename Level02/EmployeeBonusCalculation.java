import java.util.Scanner;

public class EmployeeBonusCalculation {

    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;

        // Arrays to store data for employees
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 10 employees:");

        // Input loop for salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter the salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();

                System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Salary must be positive, and years of service must not be negative. Try again.");
                }
            }
        }

        // Calculation loop for bonuses and new salaries
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double salary = salaries[i];
            double years = yearsOfService[i];

            // Calculate bonus percentage based on years of service
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;

            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            // Save results in arrays
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // Update totals
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Output results
        System.out.println("\nSummary of Bonus Calculations:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n", 
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotals:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
