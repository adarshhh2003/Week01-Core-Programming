import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array with the specified rows and columns
        int[][] matrix = new int[rows][cols];

        // Take user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array with size equal to rows * columns
        int[] oneDArray = new int[rows * cols];
        int index = 0;

        // Copy the elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index] = matrix[i][j];
                index++;  // Increment index for the 1D array
            }
        }

        // Print the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
