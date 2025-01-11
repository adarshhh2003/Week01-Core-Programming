import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take weight and height from the user
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine the weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output the result
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
