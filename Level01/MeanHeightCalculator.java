import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare an array to store heights of 11 players
        double[] heights = new double[11];

        // Prompt the user to enter heights
        System.out.println("Enter the heights of 11 football players:");

        // Initialize a variable to store the sum of heights
        double sum = 0.0;

        // Input heights and calculate the sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + mean + " meters");

        // Close the Scanner
        input.close();
    }
}