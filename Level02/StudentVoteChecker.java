import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate the age
        if (age < 0) {
            // Negative age is invalid
            return false;
        }
        // Check if the age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Input and process ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote and display the result
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is not eligible to vote.");
            }
        }

        scanner.close();
    }
}
