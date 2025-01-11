import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);  // Print the multiple
            }
        }

        // Close the scanner
        scanner.close();
    }
}
