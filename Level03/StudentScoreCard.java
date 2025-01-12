import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for each student
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array for PCM scores (Physics, Chemistry, Math)

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Random score between 50 and 100 for Physics
            scores[i][1] = 50 + random.nextInt(51); // Random score between 50 and 100 for Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Random score between 50 and 100 for Maths
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array for total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of Physics, Chemistry, and Maths
            double average = total / 3.0; // Average of the three subjects
            double percentage = (total / 300.0) * 100; // Percentage (out of 300)
            
            // Round off the values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Total | Average | Percentage");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d | %d\t  | %d\t     | %d\t | %.2f\t | %.2f\t  | %.2f%%\n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of students as input
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for each student
        int[][] studentScores = generateRandomScores(numStudents);

        // Calculate the total, average, and percentage for each student
        double[][] studentResults = calculateScores(studentScores);

        // Display the scorecard
        displayScorecard(studentScores, studentResults);

        scanner.close();
    }
}
