import java.util.*;
public class RemoveDuplicates {
	// Method to remove duplicates
	public static String modifyString(String str) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Prompt to enter a string 
	System.out.println("Enter a string");
	String str = input.nextLine().trim();
	 
	String modifiedStr = modifyString(str.toLowerCase());
	
	// Display the result
	System.out.println("The original string is " + str);
	System.out.println("The modified string without duplicates is " + modifiedStr);
	
	// Close the scanner object to release resources
	input.close(); 
	}
}