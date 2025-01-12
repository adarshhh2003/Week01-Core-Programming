import java.util.*;

public class FindFactors {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {
        int size = 0; // Variable to count the number of factors

        // First loop to determine the size of the array needed for factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                size++;
            }
        }

        // Create an array to store the factors
        int[] arr = new int[size];
        int index = 0; // Index to track position in the array

        // Second loop to actually store the factors in the array
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // If 'i' is a factor, add it to the array
                arr[index++] = i; // Store the factor and increment the index
            }
        }

        // Return the array containing all the factors
        return arr;
    }

    // Method to calculate the sum of all factors in the given array
    public int factorSum(int[] arr) {
        int sum = 0; // Initialize sum to 0

        // Loop through the array and add each factor to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Return the total sum of the factors
        return sum;
    }

    // Method to calculate the product of all factors in the given array
    public int factorProduct(int[] arr) {
        int product = 1; // Initialize product to 1 (multiplicative identity)

        // Loop through the array and multiply each factor with the product
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        // Return the total product of the factors
        return product;
    }

    // Method to calculate the sum of the squares of all factors
    public double sumOfFactorSquare(int[] arr) {
        double factorSquareSum = 0; // Initialize the sum of squares to 0

        // Loop through the array and calculate the square of each factor
        for (int i = 0; i < arr.length; i++) {
            double square = (double) Math.pow(arr[i], 2); // Calculate the square of the factor
            factorSquareSum += square; // Add the square to the total sum
        }

        // Return the sum of the squares of the factors
        return factorSquareSum;
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Display a message to the user to enter a number
        System.out.println("Enter the number");
        int number = input.nextInt();

        // Find all factors of the given number
        int[] factorArray = findFactors(number);

        // Display the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < factorArray.length; i++) {
            System.out.println(factorArray[i]);
        }

        // Create an object of FindFactors to call non-static methods
        FindFactors obj = new FindFactors();

        // Calculate and display the sum of all factors
        int sum = obj.factorSum(factorArray);
        System.out.println("The sum of all factors of " + number + " is " + sum);

        // Calculate and display the product of all factors
        int product = obj.factorProduct(factorArray);
        System.out.println("The product of all factors of " + number + " is " + product);

        // Calculate and display the sum of the squares of all factors
        double factorSquareSum = obj.sumOfFactorSquare(factorArray);
        System.out.println("The sum of the square of factors of " + number + " is " + factorSquareSum);

        // Close the Scanner object to release resources
        input.close();
    }
}

