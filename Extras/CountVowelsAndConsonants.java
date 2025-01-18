import java.util.*;
public class CountVowelsAndConsonants {
	// Method to count vowels and consonants
	public static int[] countVowelsConsonants(String str) {
		int countVowels = 0;
		int countConsonants = 0;
		for(int i=0; i<str.length(); i++) {
			// Convert the char to lower case to avoid violence
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countVowels++;
			}
			else if(Character.isLetter(ch)) {
				countConsonants++;
			}
		}
		// Return the result
		return new int[]{countVowels, countConsonants};
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to enter a string
	System.out.println("Enter a String");
	String str = input.nextLine();
	
	// Call the method and store the result
	int[] arr = countVowelsConsonants(str);
	
	// Display the results
	System.out.println("Number of vowels in the string: " + str + " is: " + arr[0]);
	System.out.println("Number of consonants in the string: " + str + " is: " + arr[1]);
	
	// Close the scanner object to release resources
	input.close(); 
	}
}