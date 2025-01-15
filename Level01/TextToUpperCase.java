import java.util.Scanner;

public class TextToUpperCase {
	// Method to convert lower case string to upper case
	public static String convertToUpperCase(String input) {
		String upperCaseText = "";
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				upperCaseText += (char)(ch -32); 
			}
			else {
				upperCaseText += ch;
			}
		}
		return upperCaseText;
	}
	
	// Method to compare two strings
	public static boolean compareStrings(String str1, String str2) {
		// Check if the length of both strings are equal or not
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			for(int i=0; i<str1.length(); i++) {
				if(str1.charAt(i) != str2.charAt(i)) { // Check character of both strings 
					return false;
				}
			}
		}
		return true;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the text
		System.out.println("Enter a text");
		String userInput = scanner.nextLine();
		
		// convert lower case to upper case by built in method
		String builtInUpperCase = userInput.toUpperCase();
		
		// convert lower case to upper case manually
		String customUpperCase = convertToUpperCase(userInput.toLowerCase());
		
		// compare two strings
		boolean areEqual = compareStrings(builtInUpperCase, customUpperCase);
		
		// Display results
		System.out.println("Original Text:" + userInput);
		System.out.println("Uppercase (Built-in):" + builtInUpperCase);
		System.out.println("Uppercase (Custom):" + customUpperCase);
		System.out.println("are both upper case results equal? " + areEqual);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}