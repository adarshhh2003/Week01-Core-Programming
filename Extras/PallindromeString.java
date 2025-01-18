import java.util.*;
public class PallindromeString {
	// Method to check the string is pallindrome or not
	public static boolean checkPallindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			// Check the characters from left and right and compare 
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Prompt to enter a string 
	System.out.println("Enter a string");
	String originalString = input.next().trim();
	
	// Call the method to reverse a string
	boolean check = checkPallindrome(originalString.toLowerCase());
	
	// Display the result
	if(check) {
		System.out.println("The given string is pallindrome");
	}
	else {
		System.out.println("The given string is not pallindrome");
	}
	
	// Close the scanner object to release resources
	input.close(); 
	}
}