import java.util.Scanner;

public class SubstringOccurences {
    // Method to find the occurence of the substring in the main string
    public static int findOccurence(String mainString, String subString) {
        if(subString.isEmpty()) {
            return 0;
        }

        int index = 0;
        int count = 0;

        while((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        // Returns the count
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt to get the input from the uer
        System.out.println("Enter the string: ");
        String mainString = input.nextLine();

        System.out.println("Enter the substring: ");
        String subString = input.nextLine();
        // Call the method to find the occurence and get the result in count variable
        int count = findOccurence(mainString, subString);

        System.out.println("The substring  " + subString + " occurs " + count + " times in the main string");
        // Close the scanner object to release resources
        input.close();
    }
}
