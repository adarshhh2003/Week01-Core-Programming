import java.util.*;
public class CheckPositiveNegativeZero {
	public static void main (String [] args) {
		// Create a scanner object to read input from the user
		Scanner input = new Scanner (System.in);
		
		// Declare a array of size five
		int []array = new int[5];
		
		// Used for loop to get input for every index
		for(int i=0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		
		// Display the output with the help of for loop and if statements and else clause
		for(int i=0; i<array.length; i++) {
			if(array[i] == 0) {
				System.out.println("The element of " + i + " index is zero number");
			}
			else if(array[i] < 0) {
				System.out.println("The element of " + i + " index is negative number");
			}
			else {
				if(array[i] % 2 == 0) {			// Check if the array element is even
					System.out.println("The element of " + i + " index is positive and even number");
				}
				else {							// Check if the array element is odd
					System.out.println("The element of " + i + " index is positive and odd number");
				}
			}
		}
		
		// Check the first element is equal, greater or less
		if(array[0] == array[4]) {
			System.out.println("The first and last element of the array is equal");
		}
		else if(array[0] < array[4]) {
			System.out.println("The first element is smaller then the last element of the array");
		}
		else {
			System.out.println("The first element is greater then the last element of the array");
		}
		
		// Close the scanner object
		input.close();
	}
}