import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest numbers among three
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Compare to find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Compare to find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

		int[] arr = {smallest, largest};
		
        // Return the smallest and largest as an array
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method and get the result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}
