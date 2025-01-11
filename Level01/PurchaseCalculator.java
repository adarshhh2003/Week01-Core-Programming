import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Displaying a message to the user to enter the unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close the scanner
        scanner.close();
    }
}
