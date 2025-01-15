import java.util.*;

public class ProcessString2 {
    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) { // Infinite loop to count each character
                str.charAt(count); // Will throw an exception when index exceeds string length
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of the string
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String str) {
        int length = findStringLength(str);
        int wordCount = 0;

        // Count words by identifying spaces
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Account for the last word

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = str.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = str.substring(start);

        return words;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

	public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
		String shortestWord = wordsWithLengths[0][0];
		String longestWord = wordsWithLengths[0][0];
		int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
		int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
		for(String[] wordLength : wordsWithLengths) {
			int length = Integer.parseInt(wordLength[1]);
			if(length < shortestLength) {
				shortestLength = length;
				shortestWord = wordLength[0];
			}
			
			if(length > longestLength) {
			longestLength = length;
			longestWord = wordLength[0];
			}
		}
		
		return new String[] {shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine(); // Take user input using nextLine()

        // Split text using custom method
        String[] customSplit = splitTextIntoWords(str);

        // Generate 2D array of words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(customSplit);

		// Find shortest and longest length and string
		String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
		
        // Display results in tabular format
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("----------------------");
        for (String[] wordLength : wordsWithLengths) {
            System.out.printf("%-15s%-10d%n", wordLength[0], Integer.parseInt(wordLength[1]));
        }
		
		 // Display shortest and longest words
        System.out.println("\nShortest Word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest Word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");

        input.close();
    }
}