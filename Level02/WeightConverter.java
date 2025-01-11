import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display a message to the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        
        // Converting pound to kg
        double weightKg = weightPounds * 2.2;
        
        // Display the result
        System.out.printf("The weight of the person in pounds is " + weightPounds + " and in kg is " + weightKg);
        
        // Close the scanner
        scanner.close();
    }
}