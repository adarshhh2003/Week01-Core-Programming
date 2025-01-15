import java.util.Scanner;

public class TextToLowercase {

    // Method to convert text to lowercase using ASCII logic
    public static String convertToLowercase(String text) {
        String lowerCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference of 32
                lowerCaseText += (char) (ch + 32);
            } else {
                lowerCaseText += ch; // Append as is if not uppercase
            }
        }
        return lowerCaseText;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal if lengths differ
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Strings are not equal if any character differs
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text:");
        String userInput = scanner.nextLine();

        // Convert to lowercase using String built-in method
        String builtInLowerCase = userInput.toLowerCase();

        // Convert to lowercase using custom method
        String customLowerCase = convertToLowercase(userInput);

        // Compare the two strings
        boolean areEqual = compareStrings(builtInLowerCase, customLowerCase);

        // Display results
        System.out.println("Original Text: " + userInput);
        System.out.println("Lowercase (Built-in): " + builtInLowerCase);
        System.out.println("Lowercase (Custom): " + customLowerCase);
        System.out.println("Are both lowercase results equal? " + areEqual);

        scanner.close();
    }
}
