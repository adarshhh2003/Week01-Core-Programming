import java.util.Scanner;

public class MaxHandshakesWithoutMethod {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Read the integer input

        // Calculate the maximum number of handshakes using the formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; // Formula to calculate combinations (nC2)

        // Display the result to the user
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes + ".");

        // Close the Scanner object to free resources
        scanner.close();
    }
}
