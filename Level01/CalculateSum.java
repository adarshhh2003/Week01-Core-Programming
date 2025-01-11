import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare an array of size ten
        double[] array = new double[10];

        // Declare a variable to store the sum
        double sum = 0.0;

        // Declare an index variable
        int index = 0;

        // Take input using a while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double element = input.nextDouble();

            if (element <= 0 || index == array.length) {
                break;
            }

            array[index] = element;
            index++;
        }

        // Display the numbers entered and calculate the sum
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }

        // Display the total sum
        System.out.println("\nThe total of all numbers is " + sum);

        // Close the scanner object
        input.close();
    }
}
