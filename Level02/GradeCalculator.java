import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;  // Since each subject is out of 100

        // Calculate Grade and Remarks based on percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standard";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks + " / 300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
