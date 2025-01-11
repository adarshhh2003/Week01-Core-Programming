import java.util.*;
public class MultiplicationCalculator {
	public static void main (String [] args) {
		// Create a scanner object to read input from the user
		Scanner input = new Scanner (System.in);
		
		// Take input variable number
		int number = input.nextInt();
		
		// Declare a array of size ten
		int []multiplicationTable = new int[11];
	
		// Calculate the result and store in the array
		for(int i=1; i<=10; i++) {
			multiplicationTable[i] = i * number;
		}
		
		// Display output from array by for loop
		for(int i=1; i<=10; i++) {
			System.out.println(number + " * " + i + " = " + multiplicationTable[i]);
		}
		
		// Close the scanner object
		input.close();
	}
}