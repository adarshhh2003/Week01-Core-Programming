import java.util.*;
public class ReverseString {
	public static String reverseString(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Prompt to enter a string 
	System.out.println("Enter a string");
	String originalString = input.next().trim();
	
	// Call the method to reverse a string
	String reverse = reverseString(originalString);
	
	// Display the result
	System.out.println("The original string is " + originalString);
	System.out.println("The reversed string is " + reverse);
	
	// Close the scanner object to release resources
	input.close(); 
	}
}