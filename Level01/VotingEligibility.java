import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter their age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
