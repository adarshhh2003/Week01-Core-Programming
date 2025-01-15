public class NullPointerExceptionDemo {

    // Method to generate a NullPointerException
    public static void generateException() {
        String text = null; // Initialize the string variable to null
        // Attempting to call a String method on a null reference
        System.out.println("Length of text: " + text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException using a try-catch block
    public static void handleException() {
        String text = null; // Initialize the string variable to null
        try {
            // Attempt to access a method on the null reference
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Catch and handle the exception
            System.out.println("NullPointerException caught: The variable 'text' is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException generation:");
        try {
            generateException(); // This will generate and throw the exception
        } catch (NullPointerException e) {
            // Catch the exception to prevent the program from terminating abruptly
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException safely:");
        handleException(); // This demonstrates safe handling of the exception
    }
}
