import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter salary
        System.out.print("Enter salary in INR: ");
        double salary = scanner.nextDouble();

        // Display a message to the user to enter bonus
        System.out.print("Enter bonus in INR: ");
        double bonus = scanner.nextDouble();

        // Compute total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");

        // Close the scanner
        scanner.close();
    }
}