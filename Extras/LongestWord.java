import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to get input
        System.out.println("Enter the sentence: ");
        String sentence = input.nextLine();
        // Create a string array to store the words of sentence by split method
        String[] words = sentence.split(" ");

        int maxLength = 0;
        String longestWord = "";
        // Find the max word
        for(String word: words) {
            if(word.length() > maxLength) {
                longestWord = word;
            }
        }
        // Display the result
        System.out.println("The longest word in a sentence is: " + longestWord);
        // Close the scanner object to release resource
        input.close();
    }
}
