import java.util.*;
public class StringLengthFinder {
	// Method to find the length of the string manually
	public static int findStringLength(String str) {
		int count = 0;
		// Using try catch block to throw exception
		try {
			while(true) {
				str.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e) {
		// Exception indicates end of the string
		}
		// return the result count
		return count;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt to enter a string
		System.out.println("Enter the string");
		String str = input.next();
		
		// Call the method to get the length of the string manually
		int customLength = findStringLength(str);
		
		// Call the built in method to get the length of the string
		int builtInLength = str.length();
		
		// Display the results
		System.out.println("Length of the string (custom method): " + customLength);
		System.out.println("Length of the string (built-in method): " + builtInLength);
		
		// Close the scanner object to release the resources
		input.close();
	}
}