import java.util.*;
public class StringProcessor {
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
	// Method to split text into words
	public static String[] splitTextIntoWords(String str) {
		int length = findStringLength(str);
		int wordCount = 0;
		// Count white spaces
		for(int i=0; i<length; i++) {
			if(str.charAt(i) == ' ') {
				wordCount++;
			}
		}
		
		wordCount++;
		
		// Fill white space index in the array
		int[] spaceIndexes = new int[wordCount-1];
		int index = 0;
		for(int i=0; i<length; i++) {
			if(str.charAt(i) == ' ') {
				spaceIndexes[index++] = i;
			}
		}
		
		String[] words = new String[wordCount];
		int start = 0;
		for(int i=0; i<wordCount-1; i++) {
			words[i] = str.substring(start, spaceIndexes[i]);
			start = spaceIndexes[i] + 1;
		}
		words[wordCount-1] = str.substring(start);
		
		return words;
	}
	
	public static boolean compareStringArrays(String[] arr1, String[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt to enter a string
		System.out.println("Enter the string");
		String str = input.nextLine();
		
		// Call custom split string method
		String[] customSplit = splitTextIntoWords(str);
		
		// Call built in split method
		String[] builtInSplit = str.split(" ");
		
		// Compare results
		boolean areEqual = compareStringArrays(customSplit, builtInSplit);
		
		// Display the results
		System.out.println("Words from custom split method: " + Arrays.toString(customSplit));
		System.out.println("Words from built-in split method: " + Arrays.toString(builtInSplit));
		System.out.println("Are the both methods equal? " + areEqual);
		
		// Close the scanner object to release the resources
		input.close();
	}
}