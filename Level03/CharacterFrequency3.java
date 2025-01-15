import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        int[] frequencies = new int[characters.length];

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already counted characters
                frequencies[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Count unique characters for result array size
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " - " + frequencies[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        String[] frequencies = findCharacterFrequencies(text);

        // Display the character frequencies
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String pair : frequencies) {
            System.out.println("   " + pair);
        }

        scanner.close();
    }
}
