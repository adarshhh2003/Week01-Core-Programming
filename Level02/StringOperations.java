import java.util.*;

public class StringOperations {
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

    // Method to trim leading and trailing spaces
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = findStringLength(str) - 1;

        // Trim leading spaces
        while (start <= end && (str.charAt(start) == ' ' || str.charAt(start) == '\t')) {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && (str.charAt(end) == ' ' || str.charAt(end) == '\t')) {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int len1 = findStringLength(str1);
        int len2 = findStringLength(str2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine(); // Take user input

        // Trim spaces using custom method
        int[] trimIndexes = trimSpaces(str);
        String trimmedString = createSubstring(str, trimIndexes[0], trimIndexes[1]);

        // Trim spaces using built-in method
        String builtInTrimmed = str.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedString, builtInTrimmed);

        // Display the results
        System.out.println("Custom Trimmed String: '" + trimmedString + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");
        System.out.println("Are the strings equal? " + isEqual);

        input.close();
    }
}
