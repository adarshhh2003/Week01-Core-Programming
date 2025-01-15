import java.util.*; // Import utility package for Scanner class

public class StringCharacterComparison {

    // Method to return all characters of a string as an array without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()]; // Create a character array of the same length as the string
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); // Assign each character from the string to the array
        }
        return charArray; // Return the character array
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays are not equal if their lengths are different
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any characters are different
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner for user input

        // Prompt user to input the string
        System.out.println("Enter a string:");
        String text = input.next();

        // Get characters using the user-defined method
        char[] customCharArray = getCharacters(text);

        // Get characters using the built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        // Display results
        System.out.println("Characters from user-defined method: " + Arrays.toString(customCharArray));
        System.out.println("Characters from built-in method: " + Arrays.toString(builtInCharArray));
        if (areEqual) {
            System.out.println("Both methods produce identical character arrays.");
        } else {
            System.out.println("The methods produce different character arrays.");
        }

        input.close(); // Close the Scanner to prevent resource leaks
    }
}
