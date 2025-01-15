import java.util.*; // Import utility package for Scanner class

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        String result = ""; // Initialize an empty string
        for (int i = start; i < end; i++) { // Loop from start to end index
            result += str.charAt(i);  // Concatenate each character to the result
        }
        return result; // Return the created substring
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal if lengths are different
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any characters differ
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner for user input
 
        System.out.println("Enter the original string:");
        String originalString = input.next();
 
        System.out.println("Enter the start index for the substring:");
        int startIndex = input.nextInt();
 
        System.out.println("Enter the end index for the substring:");
        int endIndex = input.nextInt();

        // Validate indices
        if (startIndex < 0 || endIndex > originalString.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices. Please ensure startIndex < endIndex and both are within bounds.");
        } else {
            // Create substring using charAt() method
            String customSubstring = createSubstring(originalString, startIndex, endIndex);

            // Create substring using built-in substring() method
            String builtInSubstring = originalString.substring(startIndex, endIndex);

            // Compare the substrings
            boolean areEqual = compareStrings(customSubstring, builtInSubstring);

            // Display results
            System.out.println("Substring using charAt(): " + customSubstring);
            System.out.println("Substring using built-in method: " + builtInSubstring);
            if (areEqual) {
                System.out.println("Both substrings are equal.");
            } else {
                System.out.println("Substrings are not equal.");
            }
        }

        input.close(); // Close the Scanner to prevent resource leaks
    }
}
