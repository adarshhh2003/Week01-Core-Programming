import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Displaying a message to the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maximumHandshakes);

        // Close the scanner
        scanner.close();
    }
}
