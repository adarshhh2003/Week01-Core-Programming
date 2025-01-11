import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a message to the user to enter the countdown start value
        System.out.print("Enter the starting number for the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }

        // Print the launch message
        System.out.println("Liftoff!");

        // Close the scanner
        scanner.close();
    }
}