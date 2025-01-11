import java.util.Scanner;

public class DistributeChocolate {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + ".");
        System.out.println("The number of remaining chocolates are " + remainingChocolates + ".");

        // Close the scanner
        scanner.close();
    }
}