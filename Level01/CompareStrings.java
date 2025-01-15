import java.util.*; // Importing the utility package for Scanner class

public class CompareStrings {

    // Method to compare two strings using charAt() method
    public static boolean compareTwoString(String str1, String str2) {
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare characters at each index
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any characters are different
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt user to enter the first string
        System.out.println("Enter first string:");
        String string1 = input.next();

        // Prompt user to enter the second string
        System.out.println("Enter second string:");
        String string2 = input.next();

        // Check if the lengths of the two strings are equal
        if (string1.length() == string2.length()) {
            // Compare the strings using the custom method
            boolean compare = compareTwoString(string1, string2);

            // Compare the strings using the built-in equals() method
            if (compare && string1.equals(string2)) {
                // Both methods confirm the strings are equal
                System.out.println("The strings \"" + string1 + "\" and \"" + string2 + "\" are equal using both methods.");
            } else {
                // Strings are not equal
                System.out.println("The strings \"" + string1 + "\" and \"" + string2 + "\" are not equal.");
            }
        } else {
            // Strings have different lengths and cannot be equal
            System.out.println("The strings \"" + string1 + "\" and \"" + string2 + "\" are not equal.");
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
