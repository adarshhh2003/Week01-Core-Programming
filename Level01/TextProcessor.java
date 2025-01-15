import java.util.Scanner;

public class TextProcessor {

    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100]; // Assuming max 100 words for simplicity
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words[wordCount++] = word;
                    word = "";
                }
            } else {
                word += ch;
            }
        }

        if (!word.isEmpty()) {
            words[wordCount++] = word;
        }

        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String word) {
        int length = 0;
        for (char ch : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String userInput = scanner.nextLine();

        // Split text into words
        String[] words = splitIntoWords(userInput);

        // Get words with their lengths
        String[][] wordsWithLengths = wordsWithLengths(words);

        // Display results in tabular format
        System.out.println("Word\tLength");
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t" + Integer.parseInt(wordData[1]));
        }

        scanner.close();
    }
}
