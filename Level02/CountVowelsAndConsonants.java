import java.util.*;

public class CountVowelsAndConsonants {
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

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        int length = findStringLength(str);

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            String result = checkVowelOrConsonant(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine(); // Take user input using nextLine()

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(str);

        // Display results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        input.close();
    }
}
